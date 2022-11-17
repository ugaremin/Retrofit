package com.example.retrofit.utils;

import com.example.retrofit.response.MovieSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApi {


    // Search for movies
    // https://api.themoviedb.org/3/search/movie?api_key=55b9c6a6b2aa3fdd8a0e16ec2a9971fd&query=Black+Adam
    @GET("/3/search/movie?")
    Call<MovieSearchResponse> searchMovie(
            @Query("api_key") String key,
            @Query("query") String query,
            @Query("page") int page

    );


}
