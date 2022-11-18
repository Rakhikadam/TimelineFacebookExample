package com.softhub.timelinefacebook;

public class requestfrnd {
    String name;
    String image;
    String mutual_friends;

    public requestfrnd(String name, String image, String mutual_friends) {
        this.name = name;
        this.image = image;
        this.mutual_friends = mutual_friends;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMutual_friends() {
        return mutual_friends;
    }

    public void setMutual_friends(String mutual_friends) {
        this.mutual_friends = mutual_friends;
    }
}
