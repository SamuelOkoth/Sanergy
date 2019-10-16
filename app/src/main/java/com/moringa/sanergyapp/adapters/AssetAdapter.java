package com.moringa.sanergyapp.adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.moringa.sanergyapp.R;
import com.moringa.sanergyapp.models.Assets;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AssetAdapter extends RecyclerView.Adapter<AssetAdapter.AssetViewHolder> {
    private ArrayList<Assets> mAssets = new ArrayList<>();
    private Context mContext;
    public AssetAdapter(Context context, ArrayList<Assets> assets) {
        mContext = context;
        mAssets= assets;
    }
    public class AssetViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.assetImage)
        ImageView mImageView;
        @BindView(R.id.assetName)
        TextView mNameView;
        @BindView(R.id.assetCondition)
        TextView mCondition;
        @BindView(R.id.assetStatus)
        TextView mStatus;
        private Context mContext;
        public AssetViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
        }
        public void bindAsset(Assets assets) {
            mNameView.setText(assets.getAsset_name());
            mCondition.setText(assets.getAsset_condition());
            mStatus.setText(assets.getAsset_status());
            Picasso.get().load(assets.getAsset_image()).into(mImageView);
        }
    }
    @Override
    public AssetAdapter.AssetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.asset_card, parent, false);
        AssetViewHolder viewHolder = new AssetViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(AssetAdapter.AssetViewHolder holder, int position) {
        holder.bindAsset(mAssets.get(position));
    }
    @Override
    public int getItemCount() {
        return mAssets.size();
    }
}