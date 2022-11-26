package com.varsitycollege.WIL;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class List_Employability extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_employability);
        String[] studentList = {"Fridge-R5000", "Stove-R5200", "Microwave-R1500", "Kettle-R260", "Heater-R3000", "Paint-8000", "Renovations-R50000"};
        ArrayAdapter arrayAdapter;
        listView = (ListView) findViewById(R.id.list);
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, studentList);
        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(List_Employability.this, studentList[position].toString(),
                        Toast.LENGTH_LONG).show();
            }

        });
    }
}