package com.moringa.employees;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Requestasset extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private TextView txtDetails;
    private EditText inputName, inputTitle, inputNo;
    private Button request;
    public   String mCurrentAsset;
    public  String assetId;

    private DatabaseReference mFirebaseDatabase;
    private FirebaseDatabase mFirebaseInstance;
    private FirebaseFirestore mFirestore;

    private ProgressBar mProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Request Asset");
        setContentView(R.layout.activity_requestasset);

        inputName = (EditText) findViewById(R.id.name);
        inputTitle = (EditText) findViewById(R.id.field);
        inputNo = (EditText) findViewById(R.id.num);
        mProgress = (ProgressBar) findViewById(R.id.progressBar);
        request  = (Button) findViewById(R.id.btn_add);
        mFirebaseDatabase= mFirebaseInstance.getInstance().getReference();
        mFirestore = FirebaseFirestore.getInstance();
        assetId = getIntent().getStringExtra("assets");

        request.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view){


                NewAsset asset = new NewAsset(inputName.getText().toString(),inputTitle.getText().toString(),inputNo.getText().toString());
                mFirebaseDatabase.child("assets").push().setValue(asset);
                finish();

                String message = asset.toString();
                if(!TextUtils.isEmpty(message)){
                    mProgress.setVisibility(View.VISIBLE);

                    Map<String, Object> notificationMessage = new HashMap<>();
                    notificationMessage.put("message",message);
                    notificationMessage.put("from",mFirebaseDatabase);
                    mFirestore.collection("assets/" + assetId + "/Notification").add(notificationMessage).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                        @Override
                        public void onSuccess(DocumentReference documentReference) {
                            Toast.makeText(Requestasset.this,"Notification sent",Toast.LENGTH_LONG).show();
                            asset.setAssetName("");
                            asset.setNumOfAssets("");
                            asset.setPostField("");
                            mProgress.setVisibility(View.INVISIBLE);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(Requestasset.this,"Error :" +e.getMessage() ,Toast.LENGTH_LONG).show();
                            mProgress.setVisibility(View.INVISIBLE);
                        }
                    });
                }
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_requestasset) {
            requestasset();
            return  true;
        }




        return super.onOptionsItemSelected(item);
    }
    private void requestasset() {
        Intent intent = new Intent(Requestasset.this, Status.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }





    }
