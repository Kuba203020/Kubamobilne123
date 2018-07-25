package com.example.kuba.harrypotter;

import com.example.kuba.harrypotter.api.Response;

import retrofit2.Call;
import retrofit2.http.GET;


public interface Api {

    @GET("people/")
    Call<Response> getCharacters();
}
