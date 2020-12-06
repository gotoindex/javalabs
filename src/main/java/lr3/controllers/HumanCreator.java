package lr3.controllers;

import lr3.models.HumanModel;
import lr3.models.Sex;
import lr3.models.StudentModel;

/**
 * This class is a controller for the human model.
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
public class HumanCreator {

    public HumanModel object;

    public HumanCreator(int index) {

        StudentModel student = new StudentModel();
        student.firstName += index;

        //In this case it has been decided to give female sex to every odd student.
        student.sex = index % 2 == 0 ? Sex.MALE : Sex.FEMALE;
        this.object = student;

    }

}
