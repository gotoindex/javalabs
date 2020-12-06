package lr3;

import lr3.controllers.UniversityCreator;

/**
 * This class is basically a main executable class, meaning this is the only
 * class in the whole {@code lr3} package to implement the {@code main()} method.
 * The class uses only standard java methods and objects, and a custom class
 * from package {@code university} inside {@code lr3}.
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
public class Run {

    /**
     * Initializes a {@code lr3.controllers.UniversityCreator} object,
     * generates a university and displays its contents to the user.
     *
     * @implNote This is the main function. It executes everytime the build is called.
     *
     * @param args regular string-type arguments. Note, that all arguments in
     *             this case will be ignored.
     */
    public static void main(String[] args) {

        UniversityCreator university = new UniversityCreator(1);
        university.print();

    }

}
