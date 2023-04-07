package com.example.dean3;

import java.io.Serializable;

public class Item implements Serializable {


    public Item(int image, String name, String description) {
        Image = image;
        this.name = name;
        this.description = description;
        this.price=price;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    long price ;
    int Image;
    String name;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    String description;


    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
