package com.example.and1;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

public class Penguins extends Fragment {
    private static final String Tag = "MainActivity";
    EditText mEdit;
    ProgressBar pBar;
    ImageView iView;
    Switch iSwitch;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        System.out.println("Penguins");
        View view = inflater.inflate(R.layout.activity_fourth, container, false);

        mEdit = view.findViewById(R.id.editTextTextPersonName);
        pBar = view.findViewById(R.id.progressBar);


        iView = view.findViewById(R.id.imageView);
        iSwitch = view.findViewById(R.id.switch1);
        Log.i(Tag, "onCreate was called");

        iSwitch.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                iView.setImageResource(R.drawable.ic_launcher_foreground);
            } else {
                iView.setImageResource(R.drawable.ic_launcher_background);
            }
        });

        return view;
    }


//    public void buttonClicked(View view) {
//        TextView tv = findViewById(R.id.textView);
//        Log.i(Tag, String.valueOf(tv.getText()));
//        tv.setText(mEdit.getText().toString());
//        Toast.makeText(this, "Penguins bro", Toast.LENGTH_SHORT).show();
//    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void buttonMinus(View view) {
        pBar.setProgress(pBar.getProgress() - 1, true);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void buttonPlus(View view) {
        pBar.setProgress(pBar.getProgress() + 1, true);
    }



}
