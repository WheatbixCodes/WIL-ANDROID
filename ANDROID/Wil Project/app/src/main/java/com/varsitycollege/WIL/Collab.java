package com.varsitycollege.WIL;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.varsitycollege.WIL.databinding.ActivityCollabBinding;

public class Collab extends AppCompatActivity {
    ImageView imgBack;
    ActivityCollabBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collab);
        binding=ActivityCollabBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        imgBack = (ImageView) findViewById(R.id.imgBack);


        binding.btnsubmitEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = binding.TextEmail.getText().toString();
                String subject = binding.TextSubject.getText().toString();
                String message = binding.TextMessage.getText().toString();

String [] addresses = email.split(",");

Intent intent = new Intent(Intent.ACTION_SENDTO);
intent.setData(Uri.parse("mailto:"));
intent.putExtra(Intent.EXTRA_EMAIL,addresses);
intent.putExtra(Intent.EXTRA_SUBJECT,addresses);
intent.putExtra(Intent.EXTRA_TEXT,addresses);

if (intent.resolveActivity(getPackageManager()) != null){
    startActivity(intent);
}else {
    Toast.makeText(Collab.this, "Install app", Toast.LENGTH_SHORT).show();
}
            }
        });

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back();
            }
        });
    }

    private void back() {
        Intent intent = new Intent(this, InitiativeActivity.class);
    }
}