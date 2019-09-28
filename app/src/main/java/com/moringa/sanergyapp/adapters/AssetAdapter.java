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
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AssetAdapter extends RecyclerView.Adapter<AssetAdapter.AssetViewHolder>{
    private Context context;
    private List<Assets> assetsList;

    public AssetAdapter(Context context, List<Assets> assetsList) {
        this.context = context;
        this.assetsList = assetsList;
    }
    @Override
    public AssetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.asset_card, null);
        return new AssetViewHolder(view);
    }
    @Override
    public void onBindViewHolder(AssetViewHolder holder, int position) {
        //getting the product of the specified position
        Assets assets = assetsList.get(position);

        //binding the data with the viewholder views
        holder.txtName.setText(assets.getAsset_name());
        holder.txtDistance.setText(assets.getSerial_no());
        holder.txtDiameter.setText(assets.getCondition());

        holder.imageView.setImageDrawable(context.getResources().getDrawable(assets.getThumbnail()));

    }
    @Override
    public int getItemCount() {
        return assetsList.size();
    }
    public class AssetViewHolder extends RecyclerView.ViewHolder {

        TextView txtName, txtDistance, txtGravity, txtDiameter;
        ImageView imageView;

        public AssetViewHolder(View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);
            txtGravity = itemView.findViewById(R.id.txtGravity);
            txtDiameter = itemView.findViewById(R.id.txtDiameter);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }

}
