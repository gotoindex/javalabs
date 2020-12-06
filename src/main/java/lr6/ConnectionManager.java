package lr6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This class contains a basic toolkit for connecting to a single
 * pre-defined database called <i>lr6</i>.
 *
 * <p>Please make sure you are using the correct version of Idea,
 * if you're not sure which version you are using please contact
 * the administrator. The version intended for usage is maven-14.
 *
 * <p>The documentation for the methods contained in this class includes
 * brief descriptions of the <i>implementations</i>. Such descriptions should
 * be regarded as <i>implementation notes</i>, rather than parts of the
 * <i>specification</i>. Implementors should feel free to substitute other
 * algorithms, so long as the specification itself is adhered to. (For
 * example, the algorithm used by {@code sort(Object[])} does not have to be
 * a MergeSort, but it does have to be <i>stable</i>.)
 *
 * <p>This class is a member of the
 * <a href="https://github.com/gotoindex/javalabs">
 * Java Learning Course</a>.
 *
 * @author Akim Vladimirov
 */
public class ConnectionManager {

    /*
     * These are pre-defined credentials of the database that was used for testing.
     *
     * If you want to test the connection you should replace these credentials
     * with yours.
     */
    static final String URL = "jdbc:postgresql://localhost:5432/lr6";
    static final String USER = "postgres";
    static final String PASSWORD = "postgres";

    // This attribute can be accessed outside of the class via the getConnection() method.
    private Connection conn;

    /**
     * Establishes the connection using provided credentials.
     *
     * @implNote In case of failed connection, further actions will throw
     * {@code java.sql.SQLException} error.
     */
    public void connect() {
        try {
            this.conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the database.");
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * The use of the connection instance outside of the class is
     * purely for the query-making.
     */
    public Connection getConnection() {
        return this.conn;
    }

    /**
     * Closes the connection if active.
     */
    public void closeConnection() {
        try {
            this.conn.close();
            System.out.println("Closed the connection.");
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
