package lr4;

import lr3.controllers.UniversityCreator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class JsonTest {

    @Test
    public void checkJsonConversion() throws IOException {
        JsonManager json = new JsonManager();
        String path = "./src/test/java/lr4/temp_file.json";

        UniversityCreator university = new UniversityCreator(1);
        json.dump(path, university.object);
        Assertions.assertEquals(json.load(path), university.object);
    }
}
