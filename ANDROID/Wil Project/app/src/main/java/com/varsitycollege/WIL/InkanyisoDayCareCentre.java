package com.varsitycollege.WIL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.varsitycollege.WIL.databinding.ActivityInkanyisoDayCareCentreBinding;
import com.varsitycollege.WIL.databinding.ActivitySithunjwanaFullServiceSchoolBinding;

public class InkanyisoDayCareCentre extends Activity {
    private ImageSlider imageSlider;
    private ActivityInkanyisoDayCareCentreBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inkanyiso_day_care_centre);

        imageSlider = findViewById(R.id.imagesl);


        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.image1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image4, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image4, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        //binding.backBtn.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View v) {
        //      onBackPressed();
        // }
        // });
    }
        public void collab(View view)
        {
            Intent intent = new Intent(InkanyisoDayCareCentre.this, Collab.class);
            startActivity(intent);
        }

    public void back(View view)
    {
        Intent intent = new Intent(InkanyisoDayCareCentre.this, InitiativeActivity.class);
        startActivity(intent);
    }



}
