package com.moringa.sanergyapp.ui;


import android.content.Intent;
import android.os.Bundle;


import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.moringa.sanergyapp.R;
import com.moringa.sanergyapp.adapters.AssetAdapter;
import com.moringa.sanergyapp.models.Assets;
import com.moringa.sanergyapp.models.Employees;
import com.moringa.sanergyapp.models.NewEmployees;
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
/**
 * A simple {@link Fragment} subclass.
 */
public class EmployeeDetailFragment extends Fragment {

    //the recyclerview

    private AssetAdapter mAdapter;
    public ArrayList<Assets> assets = new ArrayList<>();
    private RecyclerView mRecyclerView;


    private Employees employees;
@BindView(R.id.sendAssetTextView)
    TextView sendAssetTextView;
    @BindView(R.id.employeeImageView)
    ImageView mImageLabel;
    @BindView(R.id.assetNameTextView)
    TextView mNameLabel;
    @BindView(R.id.ratingTextView)
    TextView mRatingLabel;

    public EmployeeDetailFragment() {
        // Required empty public constructor
    }
    public static EmployeeDetailFragment newInstance(Employees employees) {
        EmployeeDetailFragment employeeDetailFragment = new EmployeeDetailFragment();
        Bundle args = new Bundle();
        args.putParcelable("employees", Parcels.wrap(employees));
        employeeDetailFragment.setArguments(args);
        return employeeDetailFragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        employees = Parcels.unwrap(getArguments().getParcelable("employees"));


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_employee_detail, container, false);
        ButterKnife.bind(this, view);

        sendAssetTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent(getActivity(),SendRequestActivity.class);
                startActivity(sendIntent);

            }
        });

        ListView listView =(ListView) view.findViewById(R.id.mainList);
        String[] assetItems = {"Overall","Wheelbarrow","RainCoat",
                "Overall","Wheelbarrow","RainCoat",
                "Overall","Wheelbarrow","RainCoat"};

        ArrayAdapter <String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                assetItems
        );
        listView.setAdapter(listViewAdapter);

        Picasso.get().load(employees.getThumbnail()).into(mImageLabel);
        mNameLabel.setText(employees.getEmp_name());
        mRatingLabel.setText(employees.getEmp_title());
        return view;
    }




}