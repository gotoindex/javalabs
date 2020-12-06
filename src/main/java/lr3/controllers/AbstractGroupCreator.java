package lr3.controllers;

import lr3.models.CommonInterface;

import java.util.Random;

/**
 * This class is a base controller that is used to define common properties of
 * of most controllers in the main package.
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
public abstract class AbstractGroupCreator<T extends CommonInterface> {

    // This generator is only used in the gen_size() method.
    public static final Random generator = new Random();

    public T object;

    /**
     * This method is used to generate a size of a group (for example, a faculty
     * can contain 1-3 chairs).
     *
     * @param from an included minimum.
     * @param to an included maximum.
     */
    public static int gen_size(int from, int to) {

        return generator.nextInt(to - from + 1) + from;

    }

}
