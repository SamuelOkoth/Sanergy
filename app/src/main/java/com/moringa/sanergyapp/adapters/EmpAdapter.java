package com.moringa.sanergyapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.moringa.sanergyapp.R;
import com.moringa.sanergyapp.models.Employees;

import java.util.List;

public class EmpAdapter extends RecyclerView.Adapter<EmpAdapter.MyViewHolder> {

    private List<Employees> employeesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name,emp_id;

        public MyViewHolder(View view) {
            super(view);
            name= (TextView) view.findViewById(R.id.name);
            emp_id = (TextView) view.findViewById(R.id.emp_id);

        }
    }


    public EmpAdapter(List<Employees> employeesList) {
        this.employeesList = employeesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.content_list, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Employees employees = employeesList.get(position);
        holder.name.setText(employees.getEmp_name());
        holder.emp_id.setText(employees.getEmp_id());

    }

    @Override
    public int getItemCount() {
        return employeesList.size();
    }
}