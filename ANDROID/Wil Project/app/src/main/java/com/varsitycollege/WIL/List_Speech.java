package com.varsitycollege.WIL;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;


public class List_Speech extends AppCompatActivity {
    private FirebaseDatabase mFirebaseDatabase;
    public static DatabaseReference myRef;
    private ArrayList<String> categoryList;
    private ListView listView;
    private ArrayAdapter<String> categoryArrayAdapter;
    private static String categoryName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_speech);

        listView = findViewById(R.id.list);

        categoryList = new ArrayList<>();
        mFirebaseDatabase = FirebaseDatabase.getInstance();

        myRef = mFirebaseDatabase.getReference("ItemsList").child("SpeechTherapy");
        categoryArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, categoryList);
        listView.setAdapter(categoryArrayAdapter);

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                    categoryName = dataSnapshot.child("itemName").getValue().toString();

                    categoryList.add(categoryName);
                }
                listView.setAdapter(categoryArrayAdapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}