package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 Button btn1,btn2,btn3;
 FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
    }

    public void button1(View view) {
    fragmentTransaction=getSupportFragmentManager().beginTransaction();
    Fragment1 fragment1=new Fragment1();
    fragmentTransaction.replace(R.id.fragment,fragment1);
    fragmentTransaction.commit();
    }

    public void button2(View view) {
        fragmentTransaction=getSupportFragmentManager().beginTransaction();
        Fragment2 fragment2=new Fragment2();
        fragmentTransaction.replace(R.id.fragment,fragment2);
        fragmentTransaction.commit();
    }

    public void buttton3(View view) {
        fragmentTransaction=getSupportFragmentManager().beginTransaction();
        Fragment3 fragment3=new Fragment3();
        fragmentTransaction.replace(R.id.fragment,fragment3);
        fragmentTransaction.commit();
    }
}