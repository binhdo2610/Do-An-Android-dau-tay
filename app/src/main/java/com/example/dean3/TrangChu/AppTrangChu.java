package com.example.dean3.TrangChu;

import android.app.Application;

import com.example.dean3.R;

import java.io.Serializable;
import java.util.ArrayList;

public class AppTrangChu extends Application {
    public static ArrayList<ItemTrangChu> db ;
    @Override
    public void onCreate(){
        super.onCreate();
        if(db==null){
            db=new ArrayList<>();
        }
    }
    public static ArrayList<ItemTrangChu> getItem(){
        db.add(new ItemTrangChu(100.000,"Naruto","Ninja lang la", R.drawable.img));
        db.add(new ItemTrangChu(100.000,"android","android studio",R.mipmap.ic_launcher));
        db.add(new ItemTrangChu(200.000,"Kakashi","Ninja lang la",R.drawable.img_1));
        return db;
    }

}
