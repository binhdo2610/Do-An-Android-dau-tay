package com.example.dean3.TrangChu;

public class ItemTrangChu {
    static double price ;

    public ItemTrangChu(double price, String name, String description, int image) {
        this.price = price;
        this.name = name;
        this.description = description;
        Image = image;
    }

    static String name ;
    String description;
    static int Image ;

    public static double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }



}
