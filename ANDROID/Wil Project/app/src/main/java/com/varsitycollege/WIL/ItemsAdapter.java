package com.varsitycollege.WIL;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class ItemsAdapter extends RecyclerView.Adapter<ItemHolder>{
    private Context context;
    private List<Itemsobj> productList;
    ItemsAdapter(Context context, List<Itemsobj> productList) {
        this.context = context;
        this.productList = productList;
    }
    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items, parent, false);
        return new ItemHolder(view);
    }
    @Override
    public void onBindViewHolder(ItemHolder holder, int position){
        Itemsobj itemsobj = productList.get(position);
        int imageRes = getResourceId(context, Itemsobj.getImagePath(), context.getPackageName());
        holder.phoneImage.setImageResource(imageRes);
        holder.phoneName.setText(Itemsobj.getName());
    }
    @Override
    public int getItemCount() {
        return productList.size();
    }
    private static int getResourceId(Context context, String pVariableName, String pPackageName) throws RuntimeException {
        try {
            return context.getResources().getIdentifier(pVariableName, "drawable", pPackageName);
        } catch (Exception e) {
            throw new RuntimeException("Error getting Resource ID.", e);
        }
    }
}