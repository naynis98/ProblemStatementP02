package com.example.a16033774.problemstatementp02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidaysAdapter extends ArrayAdapter<Holidays> {

    private ArrayList<Holidays> holidays;
    private Context context;
    private TextView tvDescription;
    private TextView tvDate;
    private ImageView imageView;

    public HolidaysAdapter(Context context, int resource, ArrayList<Holidays> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        holidays = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvDescription = (TextView) rowView.findViewById(R.id.tvdesc);
        tvDate = (TextView) rowView.findViewById(R.id.tvdate);
        // Get the ImageView object
        imageView = (ImageView) rowView.findViewById(R.id.image);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Holidays currentHoliday = holidays.get(position);
        // Set the description
        tvDescription.setText(currentHoliday.getDescription());
        // Set the image
        imageView.setImageResource(currentHoliday.image());
        //set the date
        tvDate.setText(currentHoliday.getDate());

        // Return the nicely done up View to the ListView
        return rowView;
    }
}