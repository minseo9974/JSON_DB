package project;

import org.json.JSONObject;

public class Item {
    private String itemID;
    private String model;
    private int hp;
    private int ad;
    private int def;
    private int speed;
    private int atkSpeed;

    public Item(String itemID, String model, int hp, int ad, int def, int speed, int atkSpeed) {
        ClassInvariant(hp, ad, def, speed, atkSpeed);
        this.itemID = itemID;
        this.model = model;
        this.hp = hp;
        this.ad = ad;
        this.def = def;
        this.speed = speed;
        this.atkSpeed = atkSpeed;
    }

    private void ClassInvariant(int hp, int ad, int def, int speed, int atkSpeed) {
        if (hp < 0 || ad < 0 || def < 0 || speed < 0 || atkSpeed < 0) {
            throw new IllegalArgumentException("can not be under zero");
        } else if (hp > 10000 || ad > 100 || def > 50 || speed > 100 || atkSpeed > 100) {
            throw new IllegalArgumentException("can not be under zero");
        }
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAtkSpeed() {
        return atkSpeed;
    }

    public void setAtkSpeed(int atkSpeed) {
        this.atkSpeed = atkSpeed;
    }

    public JSONObject toJSON(){
        JSONObject json = new JSONObject();
        json.put("itemID",getItemID());
        json.put("model",getModel());
        json.put("hp",getHp());
        json.put("ad",getAd());
        json.put("def",getDef());
        json.put("speed",getSpeed());
        json.put("atkSpeed",getAtkSpeed());
        return json;
    }
}
