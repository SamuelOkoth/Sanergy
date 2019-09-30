package com.moringa.sanergyapp.models;
import org.parceler.Parcel;

@Parcel
public class Employees {
    String emp_name;
    int numOfAssets;
    int thumbnail;

    public Employees() {
    }

    public Employees(String emp_name,int numOfAssets,int thumbnail) {
        this.emp_name = emp_name;
        this.numOfAssets = numOfAssets;
        this.thumbnail = thumbnail;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public int getThumbnail(){
        return  thumbnail;
    }
    public void setThumbnail(int thumbnail){
        this.thumbnail= thumbnail;
    }

    public int getNumOfAssets(){
        return  numOfAssets;
    }
    public void setEmp_image(int numOfAssets){
        this.numOfAssets = numOfAssets;
    }



}