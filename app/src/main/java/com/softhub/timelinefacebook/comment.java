package com.softhub.timelinefacebook;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;

public class comment implements Parcelable {
    String profile;
    String name;
    String comments;

    public comment(String profile, String name, String comments) {
        this.profile = profile;
        this.name = name;
        this.comments = comments;
    }

    protected comment(Parcel in) {
        profile = in.readString();
        name = in.readString();
        comments = in.readString();
    }

    public static final Creator<comment> CREATOR = new Creator<comment>() {
        @Override
        public comment createFromParcel(Parcel in) {
            return new comment(in);
        }

        @Override
        public comment[] newArray(int size) {
            return new comment[size];
        }
    };

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(profile);
        dest.writeString(name);
        dest.writeString(comments);
    }
}
