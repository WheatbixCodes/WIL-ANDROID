package com.varsitycollege.WIL;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class List_Employability extends AppCompatActivity {
    private FirebaseDatabase mFirebaseDatabase;
    public static DatabaseReference myRef;
    private ArrayList<String> categoryList;
    private ListView listView;
    private ArrayAdapter <String> categoryArrayAdapter;
    public static String categoryName;
    private Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_employability);

        listView = findViewById(R.id.list);
       // backBtn = findViewById(R.id.donationsBackBtnLtE);

        categoryList = new ArrayList<>();
        mFirebaseDatabase = FirebaseDatabase.getInstance();

        myRef = mFirebaseDatabase.getReference("ItemsList").child("Learn2Earn");
        categoryArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, categoryList);
        listView.setAdapter(categoryArrayAdapter);

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                    //snapshot.getChildren();
                    categoryName = dataSnapshot.child("itemName").getValue().toString();

                    categoryList.add(categoryName);
                }
                listView.setAdapter(categoryArrayAdapter);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        /*backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent employabilityIntent = new Intent(List_Employability.this, Employability_life_skills_training.class);
                startActivity(employabilityIntent);
            }
        });*/



    }
    public void backBtn(View view)
    {
        Intent intent = new Intent(List_Employability.this, LifeSkillsTraining.class);
        startActivity(intent);
    }
}