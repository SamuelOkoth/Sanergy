package com.moringa.sanergyapp.models;

import org.parceler.Parcel;

@Parcel
public class Assets {
    String asset_image;
    String asset_name;
    String asset_condition;
    String asset_status;

    public Assets (){

    }

    public Assets(String asset_image, String asset_name, String asset_condition, String asset_status) {
        this.asset_image = asset_image;
        this.asset_name = asset_name;
        this.asset_condition = asset_condition;
        this.asset_status = asset_status;
    }

    public String getAsset_image() {
        return asset_image;
    }

    public void setAsset_image(String asset_image) {
        this.asset_image = asset_image;
    }

    public String getAsset_name() {
        return asset_name;
    }

    public void setAsset_name(String asset_name) {
        this.asset_name = asset_name;
    }

    public String getAsset_condition() {
        return asset_condition;
    }

    public void setAsset_condition(String asset_condition) {
        this.asset_condition = asset_condition;
    }

    public String getAsset_status() {
        return asset_status;
    }

    public void setAsset_status(String asset_status) {
        this.asset_status = asset_status;
    }
}