package com.moringa.sanergyapp.ui;


import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
//import com.google.firebase.storage.FirebaseStorage;
//import com.google.firebase.storage.OnProgressListener;
//import com.google.firebase.storage.StorageReference;
//import com.google.firebase.storage.UploadTask;

import com.moringa.sanergyapp.R;
import com.moringa.sanergyapp.models.NewEmployees;


public class AddEmployeeActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private TextView txtDetails;
    private EditText inputName, inputTitle;
    private Button add;

    private DatabaseReference mFirebaseDatabase;
    private FirebaseDatabase mFirebaseInstance;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Add Employee");
        setContentView(R.layout.activity_add_employee);

        inputName = (EditText) findViewById(R.id.name);
        inputTitle = (EditText) findViewById(R.id.field);
        add = (Button) findViewById(R.id.btn_add);
        mFirebaseDatabase= mFirebaseInstance.getInstance().getReference();

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view){

                NewEmployees employees = new NewEmployees(inputName.getText().toString(),inputTitle.getText().toString() );

                mFirebaseDatabase.child("employees").push().setValue(employees);
                finish();
            }
        });
    }
}