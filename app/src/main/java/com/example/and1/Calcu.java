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

public class Calcu extends Fragment {
    TextView sumView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        System.out.println("Internet");
        View view = inflater.inflate(R.layout.activity_second, container, false);
        sumView =view.findViewById(R.id.textView5);

        return view;
    }

    public void ButtonNumber(View view) {
        Button button = (Button)view;
        System.out.println(button.getText());
        sumView.setText(sumView.getText() + "" + button.getText());
    }

    public void Clear(View view) {
        sumView.setText("");
    }

    public void Add(View view) {
        String str = (String) sumView.getText();

        if (str.contains("+"))
        {
            String [] strArr = str.split("\\+");
            System.out.println(strArr[0]);
            int sum = Integer.parseInt(strArr[0])+Integer.parseInt(strArr[1]);
            sumView.setText(Integer.toString(sum));
        }
        else{
            sumView.setText(sumView.getText() + "+");
        }

    }
}
