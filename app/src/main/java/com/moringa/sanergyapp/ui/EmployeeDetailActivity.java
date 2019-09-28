package com.moringa.sanergyapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.moringa.sanergyapp.R;
import com.moringa.sanergyapp.adapters.AssetAdapter;
import com.moringa.sanergyapp.models.Assets;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDetailActivity extends AppCompatActivity {
    //a list to store all the products
    List<Assets> assetsList;

    //the recyclerview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_detail);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        assetsList = new ArrayList<>();

        assetsList.add(
                new Assets(
                        "Shovel",
                        "Broken",
                        60000,
                        R.drawable.shovel));

        assetsList.add(
                new Assets(
                        "Overall",
                        "Broken",
                        563245,
                        R.drawable.overall));

        assetsList.add(
                new Assets(
                        "Cleaning",
                        "Broken",
                        56787654,
                        R.drawable.cleaning));

        //creating recyclerview adapter
        AssetAdapter adapter = new AssetAdapter(this, assetsList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }


}
