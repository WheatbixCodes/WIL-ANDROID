package com.varsitycollege.WIL;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;


import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.varsitycollege.WIL.databinding.ActivitySithunjwanaFullServiceSchoolBinding;
import com.varsitycollege.WIL.databinding.ActivityThandiHouseBinding;

import java.util.ArrayList;

public class Sithunjwana_full_service_school extends AppCompatActivity {
    private ImageSlider imageSlider;
    private ActivitySithunjwanaFullServiceSchoolBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sithunjwana_full_service_school);
        binding= ActivitySithunjwanaFullServiceSchoolBinding.inflate(getLayoutInflater());
        imageSlider= findViewById(R.id.imagesl);

        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.image5, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image7, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image8, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image10,ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image11, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        binding.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

    public void back(View view)
    {
        Intent intent = new Intent(Sithunjwana_full_service_school.this, InitiativeActivity.class);
        startActivity(intent);
    }

    public void items(View view)
    {
        Intent intent = new Intent(Sithunjwana_full_service_school.this, Sithunjwana_List.class);
        startActivity(intent);
    }

    public void collab(View view)
    {
        Intent intent = new Intent(Sithunjwana_full_service_school.this, Collab.class);
        startActivity(intent);
    }
}