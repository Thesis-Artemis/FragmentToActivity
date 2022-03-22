package com.example.fragmenttoactivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;


public class FragmentToActivity extends Fragment {

    private EditText edtName;
    private Button btnUpdate;
    private View view;
    private MainActivity mainActivity;

    public FragmentToActivity() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_to_activity2, container, false);
        mainActivity= (MainActivity) getActivity();
        initUI();
        return view;
    }

    private void initUI() {
        edtName= view.findViewById(R.id.edtName);
        btnUpdate= view.findViewById(R.id.btnUpdate);
        edtName.setText(mainActivity.getName());
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendDataToActivity();
            }
        });
    }

    private void sendDataToActivity() {
        String strNameUpdate= edtName.getText().toString().trim();
        mainActivity.getEdtName().setText(strNameUpdate);
    }
}