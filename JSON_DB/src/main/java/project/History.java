package project;

import java.time.LocalDateTime;
import org.json.JSONObject;

public class History {
    private String content;
    private LocalDateTime time;

    public History(String content, LocalDateTime now) {
        this.content = content;
        this.time = now;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public JSONObject toJSON() {
        JSONObject json = new JSONObject();
        json.put("content", getContent());
        json.put("time", getTime());
        return json;
    }
}
