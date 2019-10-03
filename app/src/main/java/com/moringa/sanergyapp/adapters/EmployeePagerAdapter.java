package com.moringa.sanergyapp.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.moringa.sanergyapp.models.NewEmployees;
import com.moringa.sanergyapp.ui.EmployeeDetailFragment;

import java.util.ArrayList;

public class EmployeePagerAdapter extends FragmentPagerAdapter {
    private ArrayList<NewEmployees> mEmployees;

    public EmployeePagerAdapter(FragmentManager fm, ArrayList<NewEmployees> employees) {
        super(fm);
        mEmployees = employees;
    }

    @Override
    public Fragment getItem(int position) {
        return EmployeeDetailFragment.newInstance(mEmployees.get(position));
    }

    @Override
    public int getCount() {
        return mEmployees.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mEmployees.get(position).getEmp_name();
    }
}