package com.myapplicationdev.android.p12_mydatabook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DataAdapter extends ArrayAdapter<DataList> {

    public static final String LOG_TAG = DataAdapter.class.getName();

    private ArrayList<DataList> alData;
    private Context context;

    public DataAdapter(Context context, int resource, ArrayList<DataList> objects){
        super(context, resource, objects);
        alData = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row_list, parent, false);

        TextView tvName = (TextView) rowView.findViewById(R.id.tvTitle);
        ImageView iv = (ImageView)rowView.findViewById(R.id.imageView);

        DataList dataList = alData.get(position);

        tvName.setText(dataList.getTitle());

        switch (dataList.getTitle()) {
            case "Bio":
                iv.setImageResource(R.drawable.ic_info);
                break;
            case "Vaccination":
                iv.setImageResource(R.drawable.ic_pencil);
                break;
            case "Anniversary":
                iv.setImageResource(R.drawable.ic_calendar);
                break;
            case "About Us":
                iv.setImageResource(R.drawable.ic_star);
                break;
        }


        return rowView;
    }

}