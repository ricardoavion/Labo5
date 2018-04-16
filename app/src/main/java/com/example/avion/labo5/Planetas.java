package com.example.avion.labo5;

import android.widget.ImageView;

public class Planetas {

    public String Name, desc;
    public int id;
    public ImageView image;

    public Planetas(String name, String desc, int id, ImageView image) {
        Name = name;
        this.desc = desc;
        this.id = id;
        this.image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }
}
