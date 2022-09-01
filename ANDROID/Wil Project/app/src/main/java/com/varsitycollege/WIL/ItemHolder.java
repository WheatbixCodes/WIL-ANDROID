package com.varsitycollege.WIL;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
class ItemHolder extends RecyclerView.ViewHolder {
    ImageView phoneImage;
    TextView phoneName;
    ItemHolder(View itemView) {
        super(itemView);
        phoneName = itemView.findViewById(R.id.phoneName);
        phoneImage = itemView.findViewById(R.id.phoneImage);
    }
}