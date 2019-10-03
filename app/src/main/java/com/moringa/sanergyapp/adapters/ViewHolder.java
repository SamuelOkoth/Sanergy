package com.moringa.sanergyapp.adapters;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.moringa.sanergyapp.R;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

public class ViewHolder extends RecyclerView.ViewHolder {

    View mView;

    public ViewHolder(View itemView) {
        super(itemView);

        mView = itemView;

        //item click
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mClickListener.onItemClick(view, getAdapterPosition());
            }
        });
        //item long click
        itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                mClickListener.onItemLongClick(view, getAdapterPosition());
                return true;
            }
        });

    }

    //set details to recycler view row
    public void setDetails(Context ctx, String emp_name, String emp_title,String noAssets, String image){
        //Views
        TextView mNameTv = mView.findViewById(R.id.rNameTv);
        TextView mTitle = mView.findViewById(R.id.rTitleTv);
        TextView mNoAssets = mView.findViewById(R.id.noAsset);
        ImageView mImageIv = mView.findViewById(R.id.rImageView);
        //set data to views
        mNameTv.setText(emp_name);
        mTitle.setText(emp_title);
        mNoAssets.setText(noAssets);
        Picasso.get().load(image).into(mImageIv);
    }

    private ViewHolder.ClickListener mClickListener;

    //interface to send callbacks
    public interface ClickListener{
        void onItemClick(View view, int position);
        void onItemLongClick(View  view, int position);
    }

    public void setOnClickListener(ViewHolder.ClickListener clickListener){
        mClickListener = clickListener;
    }
}