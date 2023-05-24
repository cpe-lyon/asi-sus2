package com.sus_society.model;

public class PoneyFormDTO {
    private String color;
    private String superPower;
    private String name;
    private String imgUrl;



    public PoneyFormDTO() {
        this.color = "";
        this.superPower = "";
        this.name = "";
        this.imgUrl = "";
    }

    public PoneyFormDTO(String color, String superPower, String name, String imgUrl) {
        this.color = color;
        this.superPower = superPower;
        this.name = name;
        this.imgUrl = imgUrl;
    }

    public String getColor() {
        return color;
    }

    public String getSuperPower() {
        return superPower;
    }

    public String getName() {
        return name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
