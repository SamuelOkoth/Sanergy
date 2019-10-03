package com.moringa.employees;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Requestasset extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private TextView txtDetails;
    private EditText inputName, inputTitle, inputNo;
    private Button request;

    private DatabaseReference mFirebaseDatabase;
    private FirebaseDatabase mFirebaseInstance;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Request Asset");
        setContentView(R.layout.activity_requestasset);

        inputName = (EditText) findViewById(R.id.name);
        inputTitle = (EditText) findViewById(R.id.field);
        inputNo = (EditText) findViewById(R.id.num);
        request  = (Button) findViewById(R.id.btn_add);
        mFirebaseDatabase= mFirebaseInstance.getInstance().getReference();

        request.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view){


                NewAsset asset = new NewAsset(inputName.getText().toString(),inputTitle.getText().toString(),inputNo.getText().toString());
                mFirebaseDatabase.child("assets").push().setValue(asset);

                finish();

            }
        });
    }
}