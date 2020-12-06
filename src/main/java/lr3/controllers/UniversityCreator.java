package lr3.controllers;

import lr3.models.UniversityModel;

/**
 * This class is a controller for the university model.
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
public class UniversityCreator extends AbstractGroupCreator<UniversityModel> {

    public UniversityCreator(int index) {

        UniversityModel university = new UniversityModel();
        university.head.lastName += " (Principle)";
        university.name = "University " + index;
        university.listPlural = "faculties";
        for (int i = 0; i < gen_size(3, 4); i++) university.list.add((new FacultyCreator(i + 1)).object);
        this.object = university;

    }

    /**
     * Simply calls the {@code show()} method of the model.
     */
    public void print() {
        this.object.show("");
    }

}
