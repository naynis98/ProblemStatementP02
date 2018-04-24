package com.example.a16033774.problemstatementp02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> al;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.lv);
        al = new ArrayList<String>();
        al.add("Tradition");
        al.add("Ethnic");
        //bind data source to ListView
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, al);

        //complete the binding
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedYear = al.get(position);

                Intent intentNewAct = new Intent(MainActivity.this, SecondActivity.class);
                intentNewAct.putExtra("year",selectedYear);
                startActivity(intentNewAct);


            }
        });






    }
}