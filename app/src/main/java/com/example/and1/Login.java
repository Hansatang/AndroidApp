package com.example.and1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class Login extends Fragment {
    EditText UsernameField;
    EditText PasswordField;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        System.out.println("Internet");
        View view = inflater.inflate(R.layout.activity_third, container, false);
        UsernameField = view.findViewById(R.id.editTextTextPersonName2);
        PasswordField = view.findViewById(R.id.editTextTextPersonName3);

        Button button = view.findViewById(R.id.button5);
        button.setOnClickListener(
                v -> {
                    if (UsernameField.getText().toString().equals("user@email.com") && PasswordField.getText().toString().equals("ILOVEAND")) {
                        Toast.makeText(getActivity(), "Success", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getActivity(), "Failed", Toast.LENGTH_SHORT).show();
                    }
                }
        );
        return view;
    }
}
