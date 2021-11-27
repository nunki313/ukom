package com.smkrevit.pangkas_ku.Rest;

import com.smkrevit.pangkas_ku.GetLogin;
import com.smkrevit.pangkas_ku.Login;
import com.smkrevit.pangkas_ku.getmodel1;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    @GET("/api/menu")
    Call<getmodel1> GetModel1();
    @POST("/api/login")
    Call<GetLogin> loginReg(@Body Login login);

}
