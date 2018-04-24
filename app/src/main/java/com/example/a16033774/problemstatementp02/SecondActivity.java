package com.example.a16033774.problemstatementp02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<Holidays>holsArray;
    ArrayList<Holidays>selectedHolsArray;
    ArrayAdapter aa;
    public void populate(){


        holsArray.add(new Holidays(R.drawable.christmas, "Christmas", "25/12/18", "Tradition"));
        holsArray.add(new Holidays(R.drawable.cny, "Chinese New Year", "06/02/18", "Tradition"));
        holsArray.add(new Holidays(R.drawable.newyear, "New Year's Day", "01/1/18", "Ethnic"));
        holsArray.add(new Holidays(R.drawable.nationalday, "National Day", "09/8/18", "Ethnic"));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) findViewById(R.id.lv);
        holsArray = new ArrayList<Holidays>();
        selectedHolsArray = new ArrayList<Holidays>();
        //recieve data from mainActivity
        Intent intentReceived = getIntent();
        String category = intentReceived.getStringExtra("year");
        populate();

        for (int i =0; i < holsArray.size(); i++ ) {
            if (category.equalsIgnoreCase(holsArray.get(i).getCategory())) {
                selectedHolsArray.add(holsArray.get(i));
            }
        }

        aa = new HolidaysAdapter(this,R.layout.row,selectedHolsArray);
        lv.setAdapter(aa);




    }
}
