package com.example.kuba.harrypotter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class HarryPotter extends AppCompatActivity {

    private static String BASE_URL = "http://hp-api.herokuapp.com/api/characters";

    Retrofit retrofit;
    public static Api api;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Realm.init(this);
        retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        api = retrofit.create(Api.class);

        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm.setDefaultConfiguration(realmConfiguration);
    }
    {
        setContentView(R.layout.activity_harry_potter);
    }
}
