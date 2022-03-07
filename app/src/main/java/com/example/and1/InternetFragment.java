package com.example.and1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.google.android.material.appbar.MaterialToolbar;

public class InternetFragment extends Fragment {
    TextView ResultText;
    Button penguinsButton;



    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.internet_fragment, container, false);
//        ResultText = (TextView) view.findViewById(R.id.textView6);
//        penguinsButton = (Button) view.findViewById(R.id.penguinsButton);
//
//        ActivityResultLauncher<Intent> activityResultLauncher = registerForActivityResult(
//                new ActivityResultContracts.StartActivityForResult(), result -> {
//                    Bundle bundle = result.getData().getExtras();
//                    String data = bundle.getString("result");
//                    ResultText.setText(data);
//                });
//
//        penguinsButton.setOnClickListener(v -> {
//            Intent intent = new Intent(MainActivity.this, FourthActivity.class);
//            startActivity(intent);
//        });
//        Button calculatorButton = (Button) view.findViewById(R.id.calculatorButton);
//        calculatorButton.setOnClickListener(v -> {
//            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//            startActivity(intent);
//        });
//        Button loginButton = (Button) view.findViewById(R.id.loginButton);
//        loginButton.setOnClickListener(v -> {
//            Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
//            intent.putExtra("username", "Hello");
//            activityResultLauncher.launch(intent);
//        });
//
//        navController = Navigation.findNavController(this, R.id.fragmentContainerView);
//        Button internetButton = (Button) view.findViewById(R.id.internetButton);
//        internetButton.setOnClickListener(v -> navController.navigate(R.id.internetFragment2));
        return view;
    }
}
