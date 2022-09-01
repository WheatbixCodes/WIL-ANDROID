package com.varsitycollege.WIL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

public class InkanyisoDayCareCentre extends Activity {
    private ImageSlider imageSlider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inkanyiso_day_care_centre);

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
