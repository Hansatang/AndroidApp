package com.example.and1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.fragment.app.Fragment;



public class ChooserFragment2 extends Fragment implements AdapterView.OnItemSelectedListener {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        System.out.println("Choose2");
        View view = inflater.inflate(R.layout.choose_layout, container, false);

        Spinner spinner =  view.findViewById(R.id.sp);
        spinner.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(),
                R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        return view;
    }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        System.out.println(parent.getItemAtPosition(pos));

    }

    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(getContext(), "Nothing Selected", Toast.LENGTH_SHORT).show();
    }
}