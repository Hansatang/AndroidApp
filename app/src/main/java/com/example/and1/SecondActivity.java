package com.example.and1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView sumView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        sumView =findViewById(R.id.textView5);

        Button returnButton = (Button) findViewById(R.id.button18);
        returnButton.setOnClickListener(v -> {
            finish();
        });
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