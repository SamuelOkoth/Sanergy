package com.moringa.sanergyapp.models;
import org.parceler.Parcel;

@Parcel
public class Employees {
    String emp_name;
    int numOfAssets;
    int thumbnail;
    String emp_title;

    public Employees() {
    }

    public Employees(String emp_name,int numOfAssets,String emp_title, int thumbnail) {
        this.emp_name = emp_name;
        this.numOfAssets = numOfAssets;
        this.thumbnail = thumbnail;
        this.emp_title =emp_title;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_title() {
        return emp_title;
    }

    public void setEmp_title(String emp_title) {
        this.emp_title   = emp_title;
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