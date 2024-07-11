package com.example.solarsports;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FieldsListAdapter extends ArrayAdapter<FieldsList> {

    LayoutInflater inflater;

    public FieldsListAdapter(Context context, ArrayList<FieldsList> fields) {
        super(context, 0, fields);
        inflater = LayoutInflater.from(context);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.fields_list, null);

        //ImageView image = convertView.findViewById(R.id.imageView);
        TextView textViewName = convertView.findViewById(R.id.textViewName);
        TextView textViewArea = convertView.findViewById(R.id.textViewArea);
        TextView textViewEnergy = convertView.findViewById(R.id.textViewEnergy);

        FieldsList item = getItem(position);

        //image.setImageResource(0);
        textViewName.setText(item.name);
        textViewArea.setText(item.area);
        textViewEnergy.setText(item.energy);

        return convertView;

    }

}
