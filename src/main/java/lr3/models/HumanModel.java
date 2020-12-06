package lr3.models;

import java.util.Objects;

/**
 * This class is a model that contains information about a human.
 * It's purpose is to be both a base for the {@code lr3.models.StudentModel}
 * class and to act as a head person for any group-like class in the package.
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
public class HumanModel implements CommonInterface {

    public String firstName;
    public String lastName;
    public Sex sex;

    /**
     * This main constructor is not used directly in the code but is necessary for
     * the structure of the package.
     *
     * @implNote Since no parameters are entered, all this constructor does is calling
     * a parametrized constructor, giving it pre-set parameters.
     */
    public HumanModel() {
        this("John", "Smith", Sex.MALE);
    }

    /**
     * This is the main parametrized constructor (in this class) necessary for the task
     * completion and thus the only parametrized constructor in the class.
     */
    public HumanModel(String firstName, String lastName, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    /**
     * The only purpose of this method is readability and shortening the length
     * of the code in other parts of the program.
     *
     * All it does is return all credentials of the person in question.
     */
    public String getFullName() {
        return this.firstName + " " + this.lastName + " (" + this.sex + ")";
    }

    /**
     * This method specifies the one in the interface, implemented by this class.
     *
     * All it does is display all credentials of the person in question.
     */
    @Override
    public void show(String prefix) {
        System.out.println(prefix + "- " + this.getFullName());
    }

    /*
     * The following methods are overrides for the lr4 package.
     */

    @Override
    public String toString() {
        return "{first_name=" + firstName + ", last_name=" + lastName + ", sex=" + sex + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof HumanModel)) return false;
        HumanModel human = (HumanModel) obj;
        return Objects.equals(firstName, human.firstName) &&
                Objects.equals(lastName, human.lastName) &&
                sex == human.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, sex);
    }

}
