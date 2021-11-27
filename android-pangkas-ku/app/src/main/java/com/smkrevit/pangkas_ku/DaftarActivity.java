package com.smkrevit.pangkas_ku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DaftarActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
    }



    public void button(View view) {

        Intent intent = new Intent(DaftarActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void button3(View view) {

        Intent intent = new Intent(DaftarActivity.this, LoginActivity.class);
        startActivity(intent);
    }


}