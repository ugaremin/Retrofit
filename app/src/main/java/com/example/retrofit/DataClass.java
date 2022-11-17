package com.example.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataClass {

    @SerializedName("id")
    @Expose
    private int movieId;

    @SerializedName("name")
    @Expose
    private String movieName;

    @SerializedName("original_language")
    @Expose
    private String movieOriginalLanguage;

    @SerializedName("overview")
    @Expose
    private String movieOverview;

    @SerializedName("poster_path")
    @Expose
    private String moviePosterPath;

    @SerializedName("media_type")
    @Expose
    private String movieMediaType;

    @SerializedName("first_air_date")
    @Expose
    private String movieFirstAirDate;

    @SerializedName("vote_average")
    @Expose
    private float movieVoteAverage;
}
