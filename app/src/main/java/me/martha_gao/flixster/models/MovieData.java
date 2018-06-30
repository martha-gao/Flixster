package me.martha_gao.flixster.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

@Parcel // makes class parcelable
public class MovieData {

    // values from API
    // fields must be public for parceler
    String title;
    String overview;
    String posterPath;

    String backdropPath;

    Double voteAverage;

    // no-arg, empty constructor required for Parceler
    public MovieData() {}

    public MovieData(JSONObject movie) throws JSONException {
        title = movie.getString("title");
        overview = movie.getString("overview");
        posterPath = movie.getString("poster_path");
        backdropPath = movie.getString("backdrop_path");
        voteAverage = movie.getDouble("vote_average");
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }
}
