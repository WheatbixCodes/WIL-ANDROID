package com.varsitycollege.WIL;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class InitiativeActivity extends AppCompatActivity {
    Button btnKanyiso;
    Button btnSith;
    Button btnThandi;
    Button btnEmploy;
    Button btnSkills;
    Button btnSpeech;
    Button Logout;
    TextView displayName;

    private FirebaseAuth auth;
    private FirebaseUser user;


    Button backBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_initiative);
        Logout = (Button) findViewById(R.id.btnLogout);
        btnKanyiso = (Button) findViewById(R.id.btnKanyiso);
        btnSkills = (Button) findViewById(R.id.btnSkills);
        btnSith = (Button) findViewById(R.id.btnSith);
        btnThandi = (Button) findViewById(R.id.btnThandi);
        btnEmploy = (Button) findViewById(R.id.btnLearn);
        btnSpeech = (Button) findViewById(R.id.btnSpeech);
        displayName = findViewById(R.id.usernameTxt);

        auth = FirebaseAuth.getInstance();
        user = auth.getCurrentUser();

        String name = auth.getCurrentUser().getDisplayName();
        String email = user.getEmail();
        int index = email.indexOf("@");
        String substring = email.substring(0,index);

        //displayName.setText(email);
        displayName.setText("Welcome to the Employability App, " + substring);

        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logOut();
            }
        });

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
        btnSpeech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpeech();
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
    public void openSpeech()
    {
        Intent intent = new Intent(this, SpeechTherapy.class);
        startActivity(intent);
    }

    private void logOut()
    {
        auth.signOut();
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    private void Navigate()
    {
        startActivity(new Intent(InitiativeActivity.this, SplashActivity.class));
    }
}
















