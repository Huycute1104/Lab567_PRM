package com.example.lab_567.Lab5.RecycleView2;

public class Module {
    private String name;
    private String title;
    private String description;
    private int image;

    public Module(String name, String title, String description, int image) {
        this.name = name;
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
