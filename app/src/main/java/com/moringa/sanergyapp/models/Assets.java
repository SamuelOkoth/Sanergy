package com.moringa.sanergyapp.models;

import org.parceler.Parcel;

@Parcel
public class Assets {
     String asset_name;
     int numOfAssets;
     String serial_no;
     int thumbnail;

    public Assets() {
    }

    public Assets(String asset_name, int numOfAssets, String serial_no, int thumbnail) {
        this.asset_name = asset_name;
        this.numOfAssets = numOfAssets;
        this.thumbnail = thumbnail;
        this.serial_no = serial_no;
    }

    public String getAsset_name() {
        return asset_name;
    }

    public void setAsset_name(String asset_name) {
        this.asset_name = asset_name;
    }

    public int getNumOfAssets() {
        return numOfAssets;
    }

    public void setNumOfAssets(int numOfAssets) {
        this.numOfAssets = numOfAssets;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
    public String getSerial_no(){
        return serial_no;
    }
    public void setSerial_no(String serial_no){
        this.serial_no = serial_no;
    }
}