package com.example.dean3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.dean3.Fragement.GioHangFragment;
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
                actionBar.setDisplayHomeAsUpEnabled(true);
                break;
            case R.id.mnuCart:
                fragment = new GioHangFragment();
                actionBar = getSupportActionBar();
                actionBar.setDisplayHomeAsUpEnabled(true);
                break;

        }
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.content,fragment);// thay thế cái framelayout bằng 1 trong các màn hình trên
        ft.commit(); //Lưu lại màn hình hiện tại
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()== android.R.id.home){
            display(R.id.mnuHome);
            return  true;

        }
        return true;

    }


}







