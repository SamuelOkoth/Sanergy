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
    private EditText inputName, inputTitle;
    private Button add;

    private DatabaseReference mFirebaseDatabase;
    private FirebaseDatabase mFirebaseInstance;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Request Asset");
        setContentView(R.layout.activity_requestasset);

        inputName = (EditText) findViewById(R.id.name);
        inputTitle = (EditText) findViewById(R.id.field);
        add = (Button) findViewById(R.id.btn_add);
        mFirebaseDatabase= mFirebaseInstance.getInstance().getReference();

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view){
              //  inputName.getText().toString(),inputTitle.getText().toString();
                NewAsset asset = new NewAsset(inputName.getText().toString(),inputTitle.getText().toString(),inputName.getText().toString());
                mFirebaseDatabase.child("employees").push().setValue(asset);
                finish();
            }
        });
    }
}