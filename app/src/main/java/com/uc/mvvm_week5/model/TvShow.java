package com.uc.mvvm_week5.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class TvShow implements Parcelable {

    @SerializedName("popularity")
    private String popularity;
    @SerializedName("poster")
    private String poster;
    @SerializedName("cover")
    private String cover;
    @SerializedName("title")
    private String title;
    @SerializedName("description")
    private String description;
    @SerializedName("releaseDate")
    private String releaseDate;

    public TvShow(){}

    public TvShow(String popularity, String poster, String cover, String title, String description, String releaseDate) {
        this.popularity = popularity;
        this.poster = poster;
        this.cover = cover;
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
    }

    protected TvShow(Parcel in) {
        popularity = in.readString();
        poster = in.readString();
        cover = in.readString();
        title = in.readString();
        description = in.readString();
        releaseDate = in.readString();
    }

    public static final Creator<TvShow> CREATOR = new Creator<TvShow>() {
        @Override
        public TvShow createFromParcel(Parcel in) {
            return new TvShow(in);
        }

        @Override
        public TvShow[] newArray(int size) {
            return new TvShow[size];
        }
    };

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(popularity);
        dest.writeString(poster);
        dest.writeString(cover);
        dest.writeString(title);
        dest.writeString(description);
        dest.writeString(releaseDate);
    }
}
