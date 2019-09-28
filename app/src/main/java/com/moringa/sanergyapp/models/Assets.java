package com.moringa.sanergyapp.models;

import org.parceler.Parcel;

@Parcel
public class Assets {
     String asset_name;
     String condition;
     int serial_no;
     int thumbnail;

    public Assets() {
    }

    public Assets(String asset_name, String condition, int serial_no, int thumbnail) {
        this.asset_name = asset_name;
        this.condition = condition;
        this.thumbnail = thumbnail;
        this.serial_no = serial_no;
    }

    public String getAsset_name() {
        return asset_name;
    }

    public void setAsset_name(String asset_name) {
        this.asset_name = asset_name;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
    public int getSerial_no(){
        return serial_no;
    }
    public void setSerial_no(int serial_no){
        this.serial_no = serial_no;
    }
}