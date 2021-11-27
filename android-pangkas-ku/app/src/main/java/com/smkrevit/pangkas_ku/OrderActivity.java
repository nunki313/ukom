package com.smkrevit.pangkas_ku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }


    public void pangkas1(View view) {
        Intent intent = new Intent( this, order2.class);
        startActivity(intent);

    }

    public void pangkas2(View view) {Intent intent = new Intent( this, order2.class);
        startActivity(intent);
    }
}


