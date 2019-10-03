package com.moringa.sanergyapp.models;

public class NewEmployees {
    String emp_name;
    String emp_title;

    public NewEmployees(String emp_name, String emp_title) {
        this.emp_name = emp_name;
        this.emp_title = emp_title;

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
        this.emp_title = emp_title;
    }


}
