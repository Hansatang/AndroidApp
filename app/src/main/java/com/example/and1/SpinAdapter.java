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

public class SpinAdapter extends ArrayAdapter {
    final private SpinAdapter.OnListItemClickListener mOnListItemClickListener;
    private ArrayList<SpinnerObject> objects;
    private Context context;

    SpinAdapter(Context context, int textViewResourceId, ArrayList<SpinnerObject> itemList, SpinAdapter.OnListItemClickListener listener) {
        super(context, textViewResourceId);
        this.context=context;
        objects = itemList;
        mOnListItemClickListener = listener;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        System.out.println("X");
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(R.layout.spinner_layout, parent,
                false);
        return row;
    }

    @Override
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        System.out.println("Z");
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(R.layout.spinner_layout, viewGroup,
                false);
        return row;

    }

    public interface OnListItemClickListener {
        void onListItemClick(View clickedItemIndex);
    }

}
