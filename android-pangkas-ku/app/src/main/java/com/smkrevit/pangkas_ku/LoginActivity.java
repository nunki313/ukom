package com.smkrevit.pangkas_ku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.smkrevit.pangkas_ku.Rest.ApiClientLogin;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {
    EditText username,paassword,gmail;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.user);
        paassword = findViewById(R.id.pas);
    }


    public void button2(View view) {

        if (TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(paassword.getText().toString()))

        {
            String pesan = "no text";
            Toast.makeText(LoginActivity.this, pesan, Toast.LENGTH_SHORT).show();
        }else{
            Login login = new Login();
            login.setEmail(username.getText().toString());
            login.setPassword(paassword.getText().toString());
//                    login.setAlamat(paassword.getText().toString());


            LoginUser(login);


        }
//                HomeUtama();
    }


    public void button4(View view) {

        Intent intent = new Intent( LoginActivity.this, DaftarActivity.class);
        startActivity(intent);

    }

    public void LoginUser(Login login){
        Call<GetLogin> loginCall = ApiClientLogin.loginRegInterfaace().loginReg(login);
        loginCall.enqueue(new Callback<GetLogin>() {
            @Override
            public void onResponse(Call<GetLogin> call, Response<GetLogin> response) {
                if (response.isSuccessful()){
                    Login getLogin = response.body().getData();
                    startActivity(new Intent(LoginActivity.this,HomeActivity.class).putExtra("data",getLogin));
                    finish();


                }else {
                    String  pesan1 = "gagal";
                    Toast.makeText(LoginActivity.this, pesan1, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<GetLogin> call, Throwable t) {
                String pesan ="Login Gagal";
                Toast.makeText(LoginActivity.this, pesan, Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void lupa (View view) {Intent intent = new Intent(LoginActivity.this, lupapass.class);
        startActivity(intent);
    }
}

