package com.smkrevit.pangkas_ku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void beranda(View view) {startActivity(new Intent(this, brpangkas.class));}


    public void profil1(View view) {startActivity(new Intent(this, profil.class));}
    }
