package com.example.dean3;

import android.app.Application;

import com.example.dean3.TrangChu.ItemTrangChu;
import com.example.dean3.TrangChu.ItemTrangChuAdapter;

import java.util.ArrayList;

public class App extends Application {
    public static ArrayList<ItemTrangChu> database;
    

    static ArrayList<ItemTrangChu> InitData() {
        database.add(new ItemTrangChu(100.000, "Naruto", "Ninja lang la", R.drawable.img));
        database.add(new ItemTrangChu(100.000, "android", "android studio", R.mipmap.ic_launcher));
        database.add(new ItemTrangChu(200.000, "Kakashi", "Ninja lang la", R.drawable.img_1));
        return database;
    }

    public static ArrayList<Item> db;


    @Override
    public void onCreate() {
        super.onCreate();
        if (db == null) {
            db = new ArrayList<>();
        }
        if (database == null) {
            database = new ArrayList<>();
        }
    }

    public static ArrayList<Item> getItem() {
        db.add(new Item(R.mipmap.ic_launcher, "StandeeWibu", "Mô hình đồ chơi ",100.000));
        db.add(new Item(R.drawable.img, "StandeeNaruto", "Mô hình naruto",200.000));

        return db;
    }
}
