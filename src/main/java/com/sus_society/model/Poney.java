package com.sus_society.model;

public class Poney  {
    private String color;
    private String superPower;
    private String name;
    private String imgUrl;

    public Poney() {
        this.color = "";
        this.superPower = "";
        this.name = "";
        this.imgUrl="";
    }
    public Poney(String name,String color,String superPower, String imgUrl) {
        this.color = color;
        this.superPower = superPower;
        this.name = name;
        this.imgUrl=imgUrl;
    }

    // GETTER AND SETTER
    // GetName
    public String getName() {
        return this.name;
    }

    public String getColor() {
        return color;
    }

    public String getSuperPower() {
        return superPower;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
