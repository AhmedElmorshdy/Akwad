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

import com.example.akwad.Home_fragment.Home.Adapters.UI.Home_frags;

import com.example.akwad.Cetagory.UI.Cetagory_frag;

import com.example.akwad.More_frag.getNoti.More_frag;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
        Bundle bundle;
    ImageView imageView;
     FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        BottomNavigationView bottomNavigationView = findViewById(R.id.bot);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);



         bundle = new Bundle();
        fragmentManager = getSupportFragmentManager();


        loaddefult(new Home_frags());


    }


    private void loaddefult(Fragment fragment) {

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container,new Home_frags())
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
                fragment = new Home_frags();

                break;

            case R.id.shopping:
                fragment = new Cetagory_frag();
                 bundle = new Bundle();
                bundle.putInt("id",1);
                fragment.setArguments(bundle);
                Toast.makeText(this,"Hello",Toast.LENGTH_LONG).show();


               
                break;

            case R.id.more:
                fragment = new More_frag();
                break;
            case R.id.travel:
               fragment = new Cetagory_frag();
              Bundle bundle = new Bundle();
               bundle.putInt("id",2);
               fragment.setArguments(bundle);




                break;

            case R.id.services:
                fragment = new Cetagory_frag();
                bundle = new Bundle();
                bundle.putInt("id",3);
                fragment.setArguments(bundle);



                break;


        }


        return loadfrag(fragment);
    }


    public void onClick(View view) {

        Intent intent = new Intent(this, Search.class);
        Toast.makeText(this,"hello",Toast.LENGTH_LONG).show();
        startActivity(intent);

    }


}
