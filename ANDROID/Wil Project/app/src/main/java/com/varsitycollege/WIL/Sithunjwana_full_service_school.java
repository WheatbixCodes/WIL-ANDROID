package com.varsitycollege.WIL;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class Sithunjwana_full_service_school extends AppCompatActivity {
    private ImageSlider imageSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sithunjwana_full_service_school);
        imageSlider= findViewById(R.id.imagesl);

        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.charity, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.charity, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.charity, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.charity,ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.charity, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);
    }
}