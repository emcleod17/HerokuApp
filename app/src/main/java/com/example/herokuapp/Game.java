package com.example.herokuapp;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 * Created by James on 2/24/2016.
 */
public class Game {
    //TODO make the game model

    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("platform")
    private String platform;

    @SerializedName("genre")
    private String genre;

    @SerializedName("__v")
    private String version;
}
