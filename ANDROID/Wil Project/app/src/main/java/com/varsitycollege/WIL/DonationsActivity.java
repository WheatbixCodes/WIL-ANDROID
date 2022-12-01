package com.varsitycollege.WIL;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DonationsActivity extends AppCompatActivity {
    Button submitDonation;
    Button btnSith;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donations);
        submitDonation = (Button) findViewById(R.id.submitDonation);
        btnSith = (Button) findViewById(R.id.btnSith);

        submitDonation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openNewActivity();
            }
        });
    }

            private void openNewActivity() {
                Intent intent = new Intent(this, Inkanyiso.class);
          startActivity(intent);
    }




}










    