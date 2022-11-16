package com.softhub.timelinefacebook;

import android.graphics.drawable.Drawable;

public class user {
Drawable profile;
String name;
String status;
Drawable image;
String like_count;
String comments_count;

    public user(Drawable profile, String name, String status, Drawable image, String like_count, String comments_count) {
        this.profile = profile;
        this.name = name;
        this.status = status;
        this.image = image;
        this.like_count = like_count;
        this.comments_count = comments_count;
    }

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
}

