package com.varsitycollege.WIL;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class InitiativeActivity extends AppCompatActivity {

    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initiative);
        //private initiatives
    }

    private void Navigate()
    {
        startActivity(new Intent(InitiativeActivity.this, SplashActivity.class));
    }
}