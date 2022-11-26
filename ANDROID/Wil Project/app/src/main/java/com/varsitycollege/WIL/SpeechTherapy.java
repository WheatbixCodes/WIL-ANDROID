package com.varsitycollege.WIL;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.varsitycollege.WIL.databinding.ActivityInkanyisoDayCareCentreBinding;
import com.varsitycollege.WIL.databinding.ActivityLifeSkillsTrainingBinding;
import com.varsitycollege.WIL.databinding.ActivitySpeechTherapyBinding;

import java.util.ArrayList;

public class SpeechTherapy extends AppCompatActivity {
    Button btnCollab;
    Button btnItems;
    Button btnMoney;
    private ImageSlider imageSlider;
    private ActivitySpeechTherapyBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivitySpeechTherapyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        imageSlider= findViewById(R.id.imagesl);


        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.image12, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image5, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image4,ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image3, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        btnItems = (Button) findViewById(R.id.btnItems);
        btnMoney = (Button) findViewById(R.id.btnMoney);

        btnCollab = (Button) findViewById(R.id.btnCollab);
        binding.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

    public void back(View view)
    {
        Intent intent = new Intent(SpeechTherapy.this, InitiativeActivity.class);
        startActivity(intent);
    }

    public void items(View view)
    {
        Intent intent = new Intent(SpeechTherapy.this, LIst_Thandi.class);
        startActivity(intent);
    }

    public void collab(View view)
    {
        Intent intent = new Intent(SpeechTherapy.this, Collab.class);
        startActivity(intent);
    }
}