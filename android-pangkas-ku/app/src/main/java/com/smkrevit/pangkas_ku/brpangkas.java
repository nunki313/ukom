package com.smkrevit.pangkas_ku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.smkrevit.pangkas_ku.Rest.ApiClient;
import com.smkrevit.pangkas_ku.Rest.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class brpangkas extends AppCompatActivity {

    ApiInterface ApiInterface;
    private RecyclerView aRecyclerView;
    private RecyclerView.Adapter aAdapter;
    private RecyclerView.LayoutManager aLayoutManager;
    public static brpangkas hm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brpangkas);

        aRecyclerView = (RecyclerView) findViewById(R.id.rcvpangkas);
        aLayoutManager = new LinearLayoutManager(this);
        aRecyclerView.setLayoutManager(aLayoutManager);
        ApiInterface = ApiClient.getClient().create(com.smkrevit.pangkas_ku.Rest.ApiInterface.class);
        hm = this;

        panggilRetrofit();

//        isiData();
//        load();
    }

    public void panggilRetrofit(){

        Call<getmodel1> kategoriCall = ApiInterface.GetModel1();
        kategoriCall.enqueue(new Callback<getmodel1>() {
            @Override
            public void onResponse(Call<getmodel1> call, Response<getmodel1>
                    response) {
                List<model1> model1List = response.body().getData();
                Log.d("Retrofit Get", "Jumlah data Kontak: " +
                        String.valueOf(model1List.size()));
                aAdapter = new adapter1(model1List);
                aRecyclerView.setAdapter(aAdapter);
            }

            @Override
            public void onFailure(Call<getmodel1> call, Throwable t) {
                Log.e("Retrofit Get", t.toString());
            }
        });
    }


//    public void load() {
//        recyclerView = findViewById(R.id.rcvpangkas);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//    }

//    public void isiData() {
//        model1List = new ArrayList<model1>();
//        model1List.add(new model1("pangkas jaya", "buduran sidoarjo"));
//



//        adapter = new adapter1(this, model1List);
//        recyclerView.setAdapter(adapter);


//    }
}