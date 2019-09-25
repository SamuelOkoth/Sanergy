package com.moringa.sanergyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.firebase.auth.FirebaseAuth;
import com.moringa.sanergyapp.adapters.EmpAdapter;
import com.moringa.sanergyapp.models.Employees;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Employees> employeesList = new ArrayList<>();
    private RecyclerView recyclerView;
    private EmpAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        getSupportActionBar().setTitle("Employees");

        mAdapter = new EmpAdapter(employeesList);
        final LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();
        // adding inbuilt divider line
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
    }

    private void prepareMovieData() {
        Employees employees = new Employees("Samuel Okoth", "12345678");
        employeesList.add(employees);

        employees = new Employees("Samuel Okoth", "12345678");
        employeesList.add(employees);

        employees = new Employees("Samuel Okoth",  "12345678");
        employeesList.add(employees);

        employees = new Employees("Samuel Okoth", "12345678");
        employeesList.add(employees);

        employees = new Employees("Samuel Okoth", "12345678");
        employeesList.add(employees);

        employees = new Employees("Samuel Okoth", "12345678");
        employeesList.add(employees);

        employees = new Employees("Samuel Okoth", "12345678");
        employeesList.add(employees);

        employees = new Employees("Samuel Okoth", "123456678");
        employeesList.add(employees);

        employees = new Employees("Samuel Okoth",  "12345678");
        employeesList.add(employees);

        employees = new Employees("Samuel Okoth", "12345678");
        employeesList.add(employees);

        employees = new Employees("Samuel Okoth", "12345678");
        employeesList.add(employees);

        employees = new Employees("Samuel Okoth", "12345678");
        employeesList.add(employees);

        employees = new Employees("Samuel Okoth", "12345678");
        employeesList.add(employees);


        employees = new Employees("Samuel Okoth",  "12345678");
        employeesList.add(employees);

        employees = new Employees("Samuel Okoth",  "12345678");
        employeesList.add(employees);

        employees = new Employees("Samuel Okoth", "12345678");
        employeesList.add(employees);

        employees = new Employees("Samuel Okoth",  "12345678");
        employeesList.add(employees);

        employees = new Employees("Samuel Okoth", "12345678");
        employeesList.add(employees);

        employees = new Employees("Samuel Okoth", "12345678");
        employeesList.add(employees);

        employees = new Employees("Samuel Okoth", "12345678");
        employeesList.add(employees);

        employees = new Employees("Samuel Okoth", "12345678");
        employeesList.add(employees);

        employees = new Employees("Samuel Okoth",  "samuelokoth2017@gmail.com");
        employeesList.add(employees);

        employees = new Employees("Samuel Okoth",  "samuelokoth2017@gmail.com");
        employeesList.add(employees);

        mAdapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_logout) {
            logout();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void logout() {
        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }
}
