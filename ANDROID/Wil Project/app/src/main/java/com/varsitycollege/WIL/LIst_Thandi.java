package com.varsitycollege.WIL;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class LIst_Thandi extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_thandi);

        String[] studentList = { "Classroom needs-R7000","Bathroom accessories-R1600","Nursery-R1400","Duvet covers-R4000" };
        ArrayAdapter arrayAdapter;
        listView = (ListView) findViewById(R.id.list);
        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, studentList);
        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(LIst_Thandi.this, studentList[position].toString(),
                        Toast.LENGTH_LONG).show();    }

        })    ;

    }
    }
