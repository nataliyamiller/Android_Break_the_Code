package com.epicodus.breakthecode.models;

/**
 * Created by nataliyamiller on 10/29/15.
 */
public class Partner {
    private String mName;
    private String mDescription;
    private String mWebsite;
    private int mImage;

    public Partner (String name, String description, String website, int image) {
        mName = name;
        mDescription = description;
        mWebsite = website;
        mImage = image;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int image) {
        mImage = image;
    }

    public String getWebsite() {
        return mWebsite;
    }

    public void setWebsite(String website) {
        mWebsite = website;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
