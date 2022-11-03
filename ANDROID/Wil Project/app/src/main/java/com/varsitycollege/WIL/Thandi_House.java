package com.varsitycollege.WIL;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.varsitycollege.WIL.databinding.ActivityLoginBinding;
import com.varsitycollege.WIL.databinding.ActivityThandiHouseBinding;

import java.util.ArrayList;

public class Thandi_House extends AppCompatActivity {
Button btnCollab;
    private ActivityThandiHouseBinding binding;
private ImageSlider imageSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityThandiHouseBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        imageSlider= findViewById(R.id.imagesl);


        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.image12, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image5, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image4,ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image3, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);


        btnCollab = (Button) findViewById(R.id.btnCollab);
        binding.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btnCollab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCollab();
            }
        });
    }



    private void openCollab() {
        Intent intent = new Intent(this,Collab.class);
        startActivity(intent);
    }
}