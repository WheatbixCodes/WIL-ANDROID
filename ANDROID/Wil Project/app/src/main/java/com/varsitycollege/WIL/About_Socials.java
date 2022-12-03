package com.varsitycollege.WIL;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class About_Socials extends AppCompatActivity {

    //This says image view
    ImageView instagram, facebook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_socials);

        instagram = findViewById(R.id.instagram);
        facebook = findViewById(R.id.facebook);

facebook.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String sAppLink = "fb://page/237564710351658";
        String sPackage = "com.facebook.katana";
        String sWebLink = "https://www.facebook/12H1rDeveloper";

        openNames(sAppLink,sPackage,sWebLink);
    }
});

    }

    private void openNames(String sAppLink, String sPackage, String sWebLink) {
        try {
            Uri uri = Uri.parse(sAppLink);
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(uri);
            intent.setPackage(sPackage);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }catch (ActivityNotFoundException activityNotFoundException) {
            Uri uri = Uri.parse(sWebLink);

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(uri);

            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }



    }


}