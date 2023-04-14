package com.example.dean3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.dean3.Fragement.GioHangFragment;
import com.example.dean3.Fragement.HistoryFragment;
import com.example.dean3.Fragement.KhamPhaFragment;
import com.example.dean3.Fragement.TrangChuFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
      BottomNavigationView btn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btNavigation);
        btn.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {//
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                display(item.getItemId());//gọi các fragment
                return true;
            }
        });




        display(R.id.mnuHome);
    }
    void display (int id )
    {
        Fragment fragment = null;
        switch (id)
        {
            case R.id.mnuHome:


             fragment = new TrangChuFragment();
                ActionBar actionBar = getSupportActionBar();
                actionBar.setTitle("Trang chủ");


                actionBar.setDisplayHomeAsUpEnabled(false);


             break;
            case R.id.mnuSearch:
                fragment = new KhamPhaFragment();

              actionBar = getSupportActionBar();
                actionBar.setTitle("Search");

                actionBar.setDisplayHomeAsUpEnabled(true);
                break;
            case R.id.mnuCart:
                fragment = new GioHangFragment();
                actionBar = getSupportActionBar();
                actionBar.setTitle("Giỏ hàng ");
                actionBar.setDisplayHomeAsUpEnabled(true);
                break;

        }
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.content,fragment);// thay thế cái framelayout bằng 1 trong các màn hình trên
        ft.commit(); //Lưu lại màn hình hiện tại
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        if (item.getItemId() == android.R.id.home) {
            display(R.id.mnuHome);
            return true;

        }

        switch (item.getItemId()){
            case R.id.item1:
                fragment = new HistoryFragment();

               ActionBar  actionBar = getSupportActionBar();
                actionBar.setTitle("Lịch sử đơn hàng ");

                actionBar.setDisplayHomeAsUpEnabled(true);
                break;

        }
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.content,fragment);// thay thế cái framelayout bằng 1 trong các màn hình trên
        ft.commit(); //Lưu lại màn hình hiện tại

        return true;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.topbar,menu);
        return true;
    }
}







