package com.example.akwad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.akwad.Home_frag.UI.Home_frag;
import com.example.akwad.More_frag.More_frag;
import com.example.akwad.Services_frag.Services_frag;
import com.example.akwad.Shopping_frag.Shopping_frag;
import com.example.akwad.Travel_frag.Travel_frag;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    ImageView imageView;
     FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bot);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);




        fragmentManager = getSupportFragmentManager();


        loaddefult(new Home_frag());


    }


    private void loaddefult(Fragment fragment) {

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container,new Home_frag())
                .commit();

    }

    private boolean loadfrag (Fragment fragment){

        if (fragment !=null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container,fragment)
                    .commit();
            return true;

        }
        return false;
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()){

            default:
                fragment = new Home_frag();
                break;

            case R.id.shopping:
                fragment = new Shopping_frag();
                break;

            case R.id.more:
                fragment = new More_frag();
                break;
            case R.id.travel:
                fragment = new Travel_frag();
                break;

            case R.id.services:
                fragment = new Services_frag();
                break;


        }


        return loadfrag(fragment);
    }


    public void onClick(View view) {

        Intent intent = new Intent(this,Search.class);
        Toast.makeText(this,"hello",Toast.LENGTH_LONG).show();
        startActivity(intent);

    }
}
