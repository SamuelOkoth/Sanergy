package com.moringa.sanergyapp.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.moringa.sanergyapp.R;
import com.moringa.sanergyapp.models.Employees;
import com.moringa.sanergyapp.models.NewEmployees;

import java.io.IOException;
import java.util.UUID;

import butterknife.ButterKnife;

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

