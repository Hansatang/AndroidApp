package com.example.and1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Login extends Fragment implements ListAdapter.OnListItemClickListener {
    EditText UsernameField;
    EditText PasswordField;
    RecyclerView mTestList;
    ListAdapter mListAdapter;


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
        mTestList = view.findViewById(R.id.rv);
        mTestList.hasFixedSize();
        mTestList.setLayoutManager(new LinearLayoutManager(getContext()));

        ArrayList<ListObject> list = new ArrayList<>();
        list.add(new ListObject("A", R.drawable.ic_launcher_foreground));
        list.add(new ListObject("B", R.drawable.ic_launcher_foreground));
        list.add(new ListObject("C", R.drawable.ic_launcher_foreground));
        list.add(new ListObject("D", R.drawable.ic_launcher_foreground));
        list.add(new ListObject("E", R.drawable.ic_launcher_foreground));
        list.add(new ListObject("F", R.drawable.ic_launcher_foreground));
        list.add(new ListObject("G", R.drawable.ic_launcher_foreground));
        list.add(new ListObject("H", R.drawable.ic_launcher_foreground));
        list.add(new ListObject("I", R.drawable.ic_launcher_foreground));
        list.add(new ListObject("J", R.drawable.ic_launcher_foreground));
        list.add(new ListObject("K", R.drawable.ic_launcher_foreground));
        list.add(new ListObject("M", R.drawable.ic_launcher_foreground));
        mListAdapter = new ListAdapter(list,this);
        mTestList.setAdapter(mListAdapter);

        return view;
    }


    @Override
    public void onListItemClick(View clickedItemIndex) {
        TextView resultView = (TextView) clickedItemIndex;
        Toast.makeText(getContext(), "Letter Clicked: " + resultView.getText(), Toast.LENGTH_SHORT).show();

    }
}
