package com.geeks.tilek_talaibekov_hw_3_3_1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NameViewHolder extends RecyclerView.ViewHolder {

    private TextView tvName;
    public NameViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.tv_name);
    }

    public void inBind(String name){
        tvName.setText(name);
    }
}
