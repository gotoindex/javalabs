package lr3.models;

import lr3.controllers.HumanCreator;

import java.util.ArrayList;
import java.util.Objects;

/**
 * This class is a base model that is used to define common properties of:
 * a university, a faculty, a chair, and a group.
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
public abstract class AbstractGroupModel<T extends CommonInterface> implements CommonInterface {

    /*
     * This is what each structure in the university (including the university
     * itself) have in common: a name (like the University of Technology),
     * a head (a leader or a responsible person in command), a list of
     * sub-elements (for a university its faculties, for group its students).
     */

    public String name;
    public HumanModel head;
    public ArrayList<T> list;

    /*
     * This parameter is only used in the show() method and is used to properly
     * display a plural name of sub-elements of the element (like
     * "students" in a group model).
     */
    public String listPlural;

    /**
     * This main constructor is not used directly in the code but is necessary for
     * the structure of the package.
     *
     * @implNote Since no parameters are entered, all this constructor does is calling
     * a parametrized constructor, giving it pre-set parameters.
     */
    public AbstractGroupModel() {
        this("Unknown Group", new HumanCreator(1).object, new ArrayList<>());
    }

    /**
     * This is the main parametrized constructor (in this class) necessary for the task
     * completion and thus the only parametrized constructor in the class.
     */
    public AbstractGroupModel(String name, HumanModel head, ArrayList<T> list) {
        this.name = name;
        this.head = head;
        this.list = list;
    }

    /**
     * This method specifies the one in the interface, implemented by this class.
     *
     * All it does is display all information about a group and then lists all of
     * its sub-elements.
     */
    public void show(String prefix) {
        System.out.println(prefix + "- " + this.name + ":");
        System.out.println(prefix + "  head: " + this.head.getFullName());
        System.out.println(prefix + "  list of " + this.listPlural + ":");
        for (T t : this.list) t.show(prefix + "\t");
    }

    /*
     * The following methods are overrides for the lr4 package.
     */

    @Override
    public String toString() {
        return "{head=" + head + ", name=" + name + ", list=" + list + ", list_plural=" + listPlural + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof AbstractGroupModel)) return false;
        AbstractGroupModel<?> other = (AbstractGroupModel<?>) obj;
        return Objects.equals(head, other.head) &&
                Objects.equals(name, other.name) &&
                Objects.equals(list, other.list) &&
                Objects.equals(listPlural, other.listPlural);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, name, list, listPlural);
    }
}
