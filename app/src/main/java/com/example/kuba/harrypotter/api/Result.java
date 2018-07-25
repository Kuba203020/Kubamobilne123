package com.example.kuba.harrypotter.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

public class Result extends RealmObject{

    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("species")
    @Expose
    public String species;
    @SerializedName("gender")
    @Expose
    public String gender;
    @SerializedName("house")
    @Expose
    public String house;
    @SerializedName("eyeColour")
    @Expose
    public String eyeColour;
    @SerializedName("hairColour")
    @Expose
    public String hairColour;
    @SerializedName("created")
    @Expose
    public String created;
    @SerializedName("edited")
    @Expose
    public String edited;
    @SerializedName("url")
    @Expose
    public String url;
    public boolean isFavourite;
}
