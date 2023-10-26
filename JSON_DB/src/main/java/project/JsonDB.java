package project;

import static project.JSONFIleData.loadDB;
import static project.JSONFIleData.saveDB;

import java.time.LocalDateTime;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonDB {
    public static void main(String[] args) {
        JSONObject database = loadDB();

        JSONObject userJSON = database.getJSONObject("USER");
        JSONObject itemJSON = database.getJSONObject("ITEM");
        JSONObject recordJSON = database.getJSONObject("RECORD");

        User user = new User(userJSON.getString("userID"), userJSON.getString("userName"));
        user.setUserID("tkx");
        user.setUserName("xorud");
        userJSON = user.toJOSN();

        Item item = new Item(itemJSON.getString("itemID"), itemJSON.getString("model"), itemJSON.getInt("hp"),
                itemJSON.getInt("ad"), itemJSON.getInt("def"), itemJSON.getInt("speed"), itemJSON.getInt("atkSpeed"));
        itemJSON = item.toJSON();

        Record record = new Record(recordJSON.getInt("match"), recordJSON.getInt("win"));
        recordJSON = record.toJSON();

        JSONArray historyList = database.getJSONArray("HISTORY");
        historyList.put(new History("user ID와 Name 변경 추가", LocalDateTime.now()).toJSON());

        JSONObject userDB = database;
        userDB.put("USER", userJSON);
        userDB.put("ITEM", itemJSON);
        userDB.put("RECORD", recordJSON);
        userDB.put("HISTORY", historyList);


        saveDB(database);
    }
}
