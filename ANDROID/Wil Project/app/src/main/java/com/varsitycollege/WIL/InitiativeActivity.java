package com.varsitycollege.WIL;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import android.widget.Button;

public class InitiativeActivity extends AppCompatActivity {
    Button btnKanyiso;
    Button btnSith;
    Button btnThandi;
    Button btnEmploy;
    Button btnSkills;


    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initiative);
        btnKanyiso = (Button) findViewById(R.id.btnKanyiso);
        btnSkills = (Button) findViewById(R.id.btnSkills);
        btnSith = (Button) findViewById(R.id.btnSith);
        btnThandi = (Button) findViewById(R.id.btnThandi);
        btnEmploy = (Button) findViewById(R.id.btnLearn);

        btnEmploy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEmployability();
            }
        });

        btnThandi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThandi();
            }
        });

       btnSkills.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openLife();
           }
       });

        btnKanyiso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKanyiso();
            }
        });

        btnSith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSith();
            }
        });
    }

    private void openEmployability() {
        Intent intent = new Intent(this, Employability_life_skills_training.class);
        startActivity(intent);
    }

    private void openThandi() {
        Intent intent = new Intent(this, Thandi_House.class);
        startActivity(intent);

    }

    private void openKanyiso() {
        Intent intent = new Intent(this, InkanyisoDayCareCentre.class);
        startActivity(intent);
    }

    private void openSith() {

        Intent intent = new Intent(this, Sithunjwana_full_service_school.class);
        startActivity(intent);

    }

    public void openLife()
    {
        Intent intent = new Intent(this, LifeSkillsTraining.class);
        startActivity(intent);

    }


    private void Navigate()
    {
        startActivity(new Intent(InitiativeActivity.this, SplashActivity.class));
    }
}
















