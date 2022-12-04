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
        slideModels.add(new SlideModel(R.drawable.image4, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image10, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image12, ScaleTypes.FIT));
        /*slideModels.add(new SlideModel(R.drawable.image4,ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image3, ScaleTypes.FIT));*/
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        btnItems = (Button) findViewById(R.id.btnItems);
        btnMoney = (Button) findViewById(R.id.btnMoney);

        btnCollab = (Button) findViewById(R.id.btnCollab);
        /*binding.backBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.google.com"));
                startActivity(intent);
            }
        });
        binding.btnItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SpeechTherapy.this, List_Speech.class);
                startActivity(intent);
            }
        });*/

    }

    public void openGoogle(View view)
    {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://www.google.com"));
        startActivity(intent);
    }

    public void backSpeech(View view)
    {
        Intent intent = new Intent(SpeechTherapy.this, InitiativeActivity.class);
        startActivity(intent);
    }

    public void itemsSpeech(View view)
    {
        Intent intent = new Intent(SpeechTherapy.this, List_Speech.class);
        startActivity(intent);
    }

    public void collabSpech(View view)
    {
        Intent intent = new Intent(SpeechTherapy.this, Collab.class);
        startActivity(intent);
    }
}