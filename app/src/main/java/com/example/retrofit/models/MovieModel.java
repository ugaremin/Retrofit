package com.example.retrofit.models;

import android.os.Parcel;
import android.os.Parcelable;

public class MovieModel implements Parcelable {

    private String title;
    private String poster_path;
    private String release_date;
    private String overview;
    private int id;
    private float vote_average;

    public MovieModel(String title, String posterPath, String releaseDate, String movieOverview, int movieId, float voteAverage) {
        this.title = title;
        this.poster_path = posterPath;
        this.release_date = releaseDate;
        this.overview = movieOverview;
        this.id = movieId;
        this.vote_average = voteAverage;
    }

    protected MovieModel(Parcel in) {
        title = in.readString();
        poster_path = in.readString();
        release_date = in.readString();
        overview = in.readString();
        id = in.readInt();
        vote_average = in.readFloat();
    }

    public static final Creator<MovieModel> CREATOR = new Creator<MovieModel>() {
        @Override
        public MovieModel createFromParcel(Parcel in) {
            return new MovieModel(in);
        }

        @Override
        public MovieModel[] newArray(int size) {
            return new MovieModel[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public String getReleaseDate() {
        return release_date;
    }

    public String getOverview() {
        return overview;
    }

    public int getMovieId() {
        return id;
    }

    public float getVote_average() {
        return vote_average;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(poster_path);
        parcel.writeString(release_date);
        parcel.writeString(overview);
        parcel.writeInt(id);
        parcel.writeFloat(vote_average);
    }
}
