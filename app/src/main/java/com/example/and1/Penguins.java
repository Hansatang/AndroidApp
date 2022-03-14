package com.example.and1;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
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

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Penguins extends Fragment implements View.OnClickListener {
    private static final String Tag = "MainActivity";
    EditText mEdit;
    ProgressBar pBar;
    ImageView iView;
    Switch iSwitch;
    View fragView;

    @RequiresApi(api = Build.VERSION_CODES.N)
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        System.out.println("Penguins");
        fragView = inflater.inflate(R.layout.activity_fourth, container, false);

        mEdit = fragView.findViewById(R.id.editTextTextPersonName);
        pBar = fragView.findViewById(R.id.progressBar);

        iView = fragView.findViewById(R.id.imageView);
        iSwitch = fragView.findViewById(R.id.switch1);
        Log.i(Tag, "onCreate was called");

        iSwitch.setOnCheckedChangeListener((compoundButton, b) -> {
            iView.setImageResource(b ? R.drawable.ic_launcher_foreground : R.drawable.ic_launcher_background);
        });

        Button ToastedButton = fragView.findViewById(R.id.button);
        Button plusButton = fragView.findViewById(R.id.button4);
        Button minusButton = fragView.findViewById(R.id.button3);
        ToastedButton.setOnClickListener(this);
        plusButton.setOnClickListener(this);
        minusButton.setOnClickListener(this);

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Handler handler = new Handler(Looper.getMainLooper());
        executor.execute(() -> {
            while (pBar.getProgress() !=100)
             {
                try {
                    Thread.sleep(100);
                } catch( InterruptedException e ) {}
                pBar.setProgress(pBar.getProgress() + 1, true);
            }

            /*
             * Your task will be executed here
             * you can execute anything here that
             * you cannot execute in UI thread
             * for example a network operation
             * This is a background thread and you cannot
             * access view elements here
             *
             * its like doInBackground()
             * */
            handler.post(() -> {


                pBar.setVisibility(View.GONE);
                /*
                 * You can perform any operation that
                 * requires UI Thread here.
                 *
                 * its like onPostExecute()
                 * */
            });
        });

        return fragView;
    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                TextView tv = fragView.findViewById(R.id.textView);
                Log.i(Tag, String.valueOf(tv.getText()));
                tv.setText(mEdit.getText().toString());
                Toast.makeText(getActivity(), "Penguins bro", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                pBar.setProgress(pBar.getProgress() - 1, true);
                break;
            case R.id.button4:
                pBar.setProgress(pBar.getProgress() + 1, true);
                break;
        }

    }
}
