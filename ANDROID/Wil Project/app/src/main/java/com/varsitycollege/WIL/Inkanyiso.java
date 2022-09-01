package com.varsitycollege.WIL;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
public class Inkanyiso extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inkanyiso);
        RecyclerView bestRecyclerView = findViewById(R.id.productList);
        GridLayoutManager mGrid = new GridLayoutManager(this, 2);
        bestRecyclerView.setLayoutManager(mGrid);
        bestRecyclerView.setHasFixedSize(true);
        ItemsAdapter mAdapter = new ItemsAdapter(Inkanyiso.this, getProductTestData());
        bestRecyclerView.setAdapter(mAdapter);
    }
    private List<Itemsobj> getProductTestData() {
        List<Itemsobj> featuredProducts = new ArrayList<>();
        featuredProducts.add(new Itemsobj("Iphone 6", "iphone2"));
        featuredProducts.add(new Itemsobj("Iphone 6S", "charity"));
        featuredProducts.add(new Itemsobj("Iphone 8S", " "));
        featuredProducts.add(new Itemsobj("Iphone X", "iphone2"));
        featuredProducts.add(new Itemsobj("Iphone XR", "iphone2"));
        featuredProducts.add(new Itemsobj("Iphone XS", "iphone2"));
        return featuredProducts;
    }
}