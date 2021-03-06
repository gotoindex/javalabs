package lr3.controllers;

import lr3.models.FacultyModel;

/**
 * This class is a controller for the faculty model.
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
public class FacultyCreator extends AbstractGroupCreator<FacultyModel> {

    public FacultyCreator(int index) {

        FacultyModel faculty = new FacultyModel();
        faculty.head.lastName += " (Faculty Man)";
        faculty.name = "Faculty " + index;
        faculty.listPlural = "chairs";
        for (int i = 0; i < gen_size(1, 2); i++) faculty.list.add((new ChairCreator(i + 1)).object);
        this.object = faculty;

    }

}
