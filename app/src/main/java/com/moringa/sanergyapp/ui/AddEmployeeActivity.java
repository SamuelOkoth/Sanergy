package com.moringa.sanergyapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.moringa.sanergyapp.R;
import com.moringa.sanergyapp.models.NewEmployees;

public class AddEmployeeActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private TextView txtDetails;
    private EditText inputName, inputTitle,noAssets;
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
        noAssets = (EditText) findViewById(R.id.noAsset);
        add = (Button) findViewById(R.id.add);
        mFirebaseDatabase= mFirebaseInstance.getInstance().getReference();

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view){
                NewEmployees employees = new NewEmployees(inputName.getText().toString(),inputTitle.getText().toString(),noAssets.getText().toString(),inpu);
                mFirebaseDatabase.child("employees").push().setValue(employees);
                finish();
            }
        });
    }
}

