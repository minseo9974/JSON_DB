package project;

import org.json.JSONObject;

public class User {
    private String userID;
    private String userName;

    public User(String userID, String userName) {
        this.userID = userID;
        this.userName = userName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public JSONObject toJOSN(){
        JSONObject json = new JSONObject();
        json.put("userID", getUserID());
        json.put("userName", getUserName());
        return json;
    }
}
