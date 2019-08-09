package com.example.firebaseuitest.modelo;

public class Monster {

    private String name;
    private String imageLink;
    private String fire;
    private String water;
    private String thunder;
    private String ice;
    private String dragon;
    private String poison;
    private String sleep;
    private String paralysis;
    private String blast;
    private String stun;

    public Monster(String name, String imageLink, String fire, String water, String thunder,
                   String ice, String dragon, String poison, String sleep, String paralysis, String blast, String stun) {
        this.name = name;
        this.imageLink = imageLink;
        this.fire = fire;
        this.water = water;
        this.thunder = thunder;
        this.ice = ice;
        this.dragon = dragon;
        this.poison = poison;
        this.sleep = sleep;
        this.paralysis = paralysis;
        this.blast = blast;
        this.stun = stun;

    }

    public Monster() {
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getimageLink() {
        return imageLink;
    }

    public void setimageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getfire() {
        return fire;
    }

    public void setfire(String fire) {
        this.fire = fire;
    }

    public String getwater() {
        return water;
    }

    public void setwater(String water) {
        this.water = water;
    }

    public String getthunder() {
        return thunder;
    }

    public void setthunder(String thunder) {
        this.thunder = thunder;
    }

    public String getice() {
        return ice;
    }

    public void setice(String ice) {
        this.ice = ice;
    }

    public String getdragon() {
        return dragon;
    }

    public void setdragon(String dragon) {
        this.dragon = dragon;
    }

    public String getPoison() {
        return poison;
    }

    public void setPoison(String poison) {
        this.poison = poison;
    }

    public String getSleep() {
        return sleep;
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
    }

    public String getParalysis() {
        return paralysis;
    }

    public void setParalysis(String paralysis) {
        this.paralysis = paralysis;
    }

    public String getBlast() {
        return blast;
    }

    public void setBlast(String blast) {
        this.blast = blast;
    }

    public String getStun() {
        return stun;
    }

    public void setStun(String stun) {
        this.stun = stun;
    }
}
