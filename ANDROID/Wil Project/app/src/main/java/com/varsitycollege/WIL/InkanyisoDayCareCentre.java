package com.varsitycollege.WIL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
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
Button btnMoney;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inkanyiso_day_care_centre);

        imageSlider = findViewById(R.id.imagesl);


        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.daycare1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.fooddonations2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image8, ScaleTypes.FIT));
        /*slideModels.add(new SlideModel(R.drawable.image4, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image4, ScaleTypes.FIT));*/
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);
        btnMoney = (Button) findViewById(R.id.btnMoney);

        /*binding.btnMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.google.com"));
                startActivity(intent);
            }
        });*/

        //binding.backBtn.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View v) {
        //      onBackPressed();
        // }
        // });
    }

    public void google(View view)
    {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://www.google.com"));
        startActivity(intent);
    }
        public void collab(View view)
        {
            Intent intent = new Intent(InkanyisoDayCareCentre.this, Collab.class);
            startActivity(intent);
        }

        public void openList(View view)
        {
            Intent intent = new Intent(this, List_Inkanyiso.class);
            startActivity(intent);
        }

    public void back(View view)
    {
        Intent intent = new Intent(InkanyisoDayCareCentre.this, InitiativeActivity.class);
        startActivity(intent);
    }



}
