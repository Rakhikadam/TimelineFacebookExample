package com.softhub.timelinefacebook;

import android.graphics.drawable.Drawable;

public class comment {
    Drawable profile;
    String name;
    String comments;

    public comment(Drawable profile, String name, String comments) {
        this.profile = profile;
        this.name = name;
        this.comments = comments;
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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
