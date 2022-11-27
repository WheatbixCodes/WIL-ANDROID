package com.varsitycollege.WIL;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.varsitycollege.WIL.databinding.ActivityEmployabilityLifeSkillsTrainingBinding;
import com.varsitycollege.WIL.databinding.ActivitySithunjwanaFullServiceSchoolBinding;

import java.util.ArrayList;

public class Employability_life_skills_training extends AppCompatActivity {

    private ActivityEmployabilityLifeSkillsTrainingBinding binding;
    private ImageSlider imageSlider;
Button btnMoney;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employability_life_skills_training);

        imageSlider= findViewById(R.id.imagesl);


        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.image1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image4,ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image4, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);
        btnMoney = (Button) findViewById(R.id.btnMoney);
        binding.btnMoney.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.google.com"));
                startActivity(intent);
            }
        });

    }



    public void collab1(View view)
    {
        Intent intent = new Intent(Employability_life_skills_training.this, Collab.class);
        startActivity(intent);
    }

}