package com.softhub.timelinefacebook;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class user implements Parcelable {
Drawable profile;
String name;
String status;
Drawable image;
String like_count;
String comments_count;
ArrayList<comment> comments;

    public user(Drawable profile, String name, String status, Drawable image, String like_count, String comments_count, ArrayList<comment> comments) {
        this.profile = profile;
        this.name = name;
        this.status = status;
        this.image = image;
        this.like_count = like_count;
        this.comments_count = comments_count;
        this.comments = comments;
    }

    protected user(Parcel in) {
        name = in.readString();
        status = in.readString();
        like_count = in.readString();
        comments_count = in.readString();
    }

    public ArrayList<comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<comment> comments) {
        this.comments = comments;
    }

    public static final Creator<user> CREATOR = new Creator<user>() {
        @Override
        public user createFromParcel(Parcel in) {
            return new user(in);
        }

        @Override
        public user[] newArray(int size) {
            return new user[size];
        }
    };

    public Drawable getProfile() {
        return profile;
    }

    public void setProfile(Drawable profile) {
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getLike_count() {
        return like_count;
    }

    public void setLike_count(String like_count) {
        this.like_count = like_count;
    }

    public String getComments_count() {
        return comments_count;
    }

    public void setComments_count(String comments_count) {
        this.comments_count = comments_count;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(status);
        dest.writeString(like_count);
        dest.writeString(comments_count);

    }
}

