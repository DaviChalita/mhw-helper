package com.example.firebaseuitest.modelo;

public class Monster {

    private String name;
    private String imageLink;
    private String fire;
    private String water;
    private String thunder;
    private String ice;
    private String dragon;

    public Monster(String name, String imageLink, String fire, String water, String thunder, String ice, String dragon) {
        this.name = name;
        this.imageLink = imageLink;
        this.fire = fire;
        this.water = water;
        this.thunder = thunder;
        this.ice = ice;
        this.dragon = dragon;

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
}
