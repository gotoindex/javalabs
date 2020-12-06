package lr4;

import com.google.gson.Gson;
import lr3.models.UniversityModel;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;

/**
 * This class implements basic JSON converter for the {@code lr3} package.
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
public class JsonManager {

    /*
     * It has been decided to use Google's Gson package instead of Java's
     * regular JSON manager package, mainly because of the convenience of the former.
     */

    private final Gson gson = new Gson();

    /**
     * Converts contents of a JSON file (.json) to an instance of
     * the {@code lr3.models.UniversityModel} class.
     *
     * @param path full path to the JSON file.
     */
    public UniversityModel load(String path) throws IOException {
        return gson.fromJson(new FileReader(path), (Type)UniversityModel.class);
    }

    /**
     * Converts an instance of the {@code lr3.models.UniversityModel} class
     * to a JSON string, and then dumps it into a .json file.
     *
     * @param path full path to the JSON file (will be created if doesn't exist).
     * @param from an instance that will be dumped.
     */
    public void dump(String path, UniversityModel from) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        gson.toJson(from, fileWriter);
        fileWriter.close();
    }
}
