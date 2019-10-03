package com.moringa.sanergyapp.models;

public class NewEmployees {
    String emp_name;
    String emp_title;
    String no_assets;
    String emp_image;

    public NewEmployees(String emp_name, String emp_title,String no_assets,String emp_image) {
        this.emp_name = emp_name;
        this.emp_title = emp_title;
        this.no_assets = no_assets;
        this.emp_image = emp_image;
    }

    public String getEmp_image() {
        return emp_image;
    }

    public void setEmp_image(String emp_image) {
        this.emp_image = emp_image;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public String getNo_assets() {
        return no_assets;
    }

    public void setNo_assets(String no_assets) {
        this.no_assets = no_assets;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_title() {
        return emp_title;
    }

    public void setEmp_title(String emp_title) {
        this.emp_title = emp_title;
    }


}
