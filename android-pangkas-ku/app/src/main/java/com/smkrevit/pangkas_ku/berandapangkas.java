package com.smkrevit.pangkas_ku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class berandapangkas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berandapangas);
    }
    public void lihat(View view) {startActivity(new Intent(this,OrderActivity.class));}
}