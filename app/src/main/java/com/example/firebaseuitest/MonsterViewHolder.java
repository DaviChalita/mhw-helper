package com.example.firebaseuitest;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MonsterViewHolder extends RecyclerView.ViewHolder {

    public TextView textName;
    public ImageView imageMonster;
    public ImageView imageFire;
    public ImageView imageWater;
    public ImageView imageThunder;
    public ImageView imageIce;
    public ImageView imageDragon;

    public MonsterViewHolder(@NonNull View itemView) {
        super(itemView);

        textName = itemView.findViewById(R.id.textViewMonster);
        imageMonster = itemView.findViewById(R.id.imageViewMonster);
        imageFire = itemView.findViewById(R.id.imageViewFire);
        imageWater = itemView.findViewById(R.id.imageViewWater);
        imageThunder = itemView.findViewById(R.id.imageViewThunder);
        imageIce = itemView.findViewById(R.id.imageViewIce);
        imageDragon = itemView.findViewById(R.id.imageViewDragon);
    }
}
