package com.example.and1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ChooserFragment extends Fragment implements SpinAdapter.OnListItemClickListener {
    Spinner spinnerList;
    SpinAdapter mSpinAdapter;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        System.out.println("Choose");
        View view = inflater.inflate(R.layout.choose_layout, container, false);
        spinnerList = view.findViewById(R.id.sp);
        ArrayList<SpinnerObject> list = new ArrayList<>();
        list.add(new SpinnerObject("A"));
        list.add(new SpinnerObject("B"));
        list.add(new SpinnerObject("C"));

        mSpinAdapter = new SpinAdapter(getContext(), R.layout.spinner_layout, list, this);
        spinnerList.setAdapter(mSpinAdapter);

        return view;
    }


    @Override
    public void onListItemClick(View clickedItemIndex) {
        System.out.println("Yay");
    }
}
