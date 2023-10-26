package project;

import org.json.JSONObject;

public class Record {
    private int match;
    private int win;

    public Record(int match, int win) {
        this.match = match;
        this.win = win;
    }

    public int getMatch() {
        return match;
    }

    public void setMatch(int match) {
        this.match = match;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }
    public JSONObject toJSON(){
        JSONObject json = new JSONObject();
        json.put("match",getMatch());
        json.put("win",getWin());
        return json;
    }
}
