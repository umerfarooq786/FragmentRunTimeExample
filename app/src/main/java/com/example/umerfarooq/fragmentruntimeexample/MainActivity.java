package com.example.umerfarooq.fragmentruntimeexample;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static android.support.v4.app.FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager=getSupportFragmentManager();
        if(findViewById(R.id.fragment_container)!=null){
            if(savedInstanceState!=null)
            {
                return;
            }
            android.support.v4.app.FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            HomeFragment homeFragment=new HomeFragment();
            fragmentTransaction.add(R.id.fragment_container,homeFragment,null);
            fragmentTransaction.commit();
        }
    }
}
