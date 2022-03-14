package com.example.and1;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SpinAdapter extends ArrayAdapter implements View.OnClickListener {
    final private OnListItemClickListener mOnListItemClickListener;
    private Context context;
    private ArrayList<SpinnerObject> objects;

    SpinAdapter(Context context, int textViewResourceId, ArrayList<SpinnerObject> itemList,
                SpinAdapter.OnListItemClickListener listener) {
        super(context, textViewResourceId, itemList);
        this.context = context;
        this.objects = itemList;
        mOnListItemClickListener = listener;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(R.layout.spinner_layout, parent,false);
        TextView textView = row.findViewById(R.id.tv_name);
        textView.setText(objects.get(position).getName());
        return row;
    }

    @Override
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(R.layout.spinner_layout, viewGroup,false);
        TextView textView = row.findViewById(R.id.tv_name);
        textView.setText(objects.get(i).getName());
        textView.setOnClickListener(this);
        return row;

    }

    @Override
    public void onClick(View view) {
        mOnListItemClickListener.onListItemClick(view.findViewById(R.id.tv_name));
    }

    public interface OnListItemClickListener {
        void onListItemClick(View clickedItemIndex);
    }

}
