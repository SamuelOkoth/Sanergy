package com.moringa.sanergyapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.moringa.sanergyapp.R;
import com.moringa.sanergyapp.adapters.EmployeePagerAdapter;
import com.moringa.sanergyapp.models.Employees;

import org.parceler.Parcels;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EmployeeDetailActivity extends AppCompatActivity {

    @BindView(R.id.viewPager)
    ViewPager mViewPager;

    private EmployeePagerAdapter adapterViewPager;
    ArrayList<Employees> mEmployees= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_detail);
        ButterKnife.bind(this);

        mEmployees = Parcels.unwrap(getIntent().getParcelableExtra("employees"));
        int startingPosition = getIntent().getIntExtra("position", 0);

        adapterViewPager = new EmployeePagerAdapter(getSupportFragmentManager(), mEmployees);
        mViewPager.setAdapter(adapterViewPager);
        mViewPager.setCurrentItem(startingPosition);

    }
}
