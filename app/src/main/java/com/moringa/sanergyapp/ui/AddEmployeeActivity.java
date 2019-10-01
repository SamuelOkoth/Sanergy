package com.moringa.sanergyapp.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.core.view.View;
import com.moringa.sanergyapp.R;
import com.moringa.sanergyapp.models.Employees;

public class AddEmployeeActivity extends AppCompatActivity  {
private DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_employee);
        databaseReference = FirebaseDatabase.getInstance().getReference();


    }
    public void handleDataSave(View view){
        Employees newEmployees = new Employees("Samuel",2,"Manager",3);
        databaseReference.child(newEmployees.getEmp_name()).setValue(newEmployees);
    }

}
