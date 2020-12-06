package lr1;

/**
 * This class contains a simple string of code that, when executed, invokes
 * java's inner mechanisms and, using a very helpful class called {@code System}
 * and its useful method println, displays a nice message to the user in the
 * terminal.
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
public class BoringHelloWorld {

    /**
     * Displays a message in a user's terminal. The message itself reads
     * <b>Hello World</b> and is simply a nice gesture to cheer the user up.
     *
     * @implNote The algorithm uses a built-in method implemented by the {@code System} class
     * and has no particular algorithmic value.
     *
     * @implNote This is the main function. It executes everytime the file is called.
     *
     * @param args regular string-type arguments. Note, that all arguments in
     *             this case will be ignored.
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
