package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONObject;

public class JSONFIleData {
    private static final File DB_FILE = new File("src/main/resources/database.json");

    public static JSONObject loadDB() {
        try (FileReader reader = new FileReader(DB_FILE)) {
            return new JSONObject(new org.json.JSONTokener(reader));
        } catch (IOException e) {
            return new JSONObject();
        }
    }

    public static void saveDB(JSONObject object){
        try (FileWriter writer = new FileWriter(DB_FILE)) {
            writer.write(object.toString(4));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
