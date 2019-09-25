package com.moringa.sanergyapp.models;

public class Employees {
    private String emp_name;
    private int emp_id;
    private String email;

    public Employees() {
    }

    public Employees(String emp_name, String email) {
        this.emp_name = emp_name;
        this.email = email;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmail(){
        return  email;
    }
    public void setEmail(String email){
        this.email = email;
    }


}