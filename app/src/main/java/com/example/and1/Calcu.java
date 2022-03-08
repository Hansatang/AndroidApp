package com.example.and1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Calcu extends Fragment implements View.OnClickListener {
    TextView sumView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        System.out.println("Internet");
        View view = inflater.inflate(R.layout.activity_second, container, false);
        sumView = view.findViewById(R.id.textView5);

        View button = view.findViewById(R.id.button15);
        int[] ids = {R.id.button6, R.id.button7, R.id.button8, R.id.button9, R.id.button10,
                R.id.button11, R.id.button12, R.id.button13, R.id.button14, R.id.button16};

        for (int i : ids) {
            view.findViewById(i).setOnClickListener(this);
        }

        button.setOnClickListener(
                v -> sumView.setText("")
        );

        View button1 = view.findViewById(R.id.button17);
        button1.setOnClickListener(
                v -> {
                    String str = (String) sumView.getText();

                    if (str.contains("+")) {
                        String[] strArr = str.split("\\+");
                        System.out.println(strArr[0]);
                        int sum = Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[1]);
                        sumView.setText(Integer.toString(sum));
                    } else {
                        sumView.setText(sumView.getText() + "+");
                    }
                }
        );
        return view;
    }

    @Override
    public void onClick(View view) {
        Button button = (Button) view;
        System.out.println(button.getText());
        sumView.setText(sumView.getText() + "" + button.getText());
    }
}
