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
import com.varsitycollege.WIL.databinding.ActivityLoginBinding;
import com.varsitycollege.WIL.databinding.ActivityThandiHouseBinding;

import java.util.ArrayList;

public class Thandi_House extends AppCompatActivity {
Button btnCollab;
   Button btnItems;
   Button btnMoney;
    private ActivityThandiHouseBinding binding;
private ImageSlider imageSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityThandiHouseBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        imageSlider= findViewById(R.id.imagesl);


        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.image2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.thandihouse1, ScaleTypes.FIT));
        /*slideModels.add(new SlideModel(R.drawable.image4,ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image3, ScaleTypes.FIT));*/
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        btnItems = (Button) findViewById(R.id.btnItems);
        btnCollab = (Button) findViewById(R.id.btnCollab);
        btnMoney = (Button) findViewById(R.id.btnCollab);

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

        binding.btnItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThandilist();
            }
        });
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

    private void openThandilist() {
        Intent intent = new Intent(this,LIst_Thandi.class);
        startActivity(intent);
    }


    private void openCollab() {
        Intent intent = new Intent(this,Collab.class);
        startActivity(intent);
    }
}