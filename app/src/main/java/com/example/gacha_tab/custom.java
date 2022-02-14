package com.example.gacha_tab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.Random;

public class custom extends Fragment {
    private TextView mTextView;
    private EditText AddText;
    private final ArrayList<String> cus = new ArrayList<>();
    private String sh = "";
    private String ad;
    private int i=0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragcus, container, false);

        mTextView = v.findViewById(R.id.textView);
        AddText = v.findViewById(R.id.editTextTextPersonName);
        Button mButton = v.findViewById(R.id.button);
        mButton.setOnClickListener(v1 -> random());

        Button add = v.findViewById(R.id.add);
        add.setOnClickListener(v2 -> {
            Addtext();
            AddShow();
            AddText.getText().clear();
        });

        Button show = v.findViewById(R.id.show);
        show.setOnClickListener(v3 -> Toast.makeText(getContext(), sh, Toast.LENGTH_SHORT).show());

        Button cl = v.findViewById(R.id.cl);
        cl.setOnClickListener(v4 ->{
            cus.clear();
            sh = "";
            i = 0;
            mTextView.setText("");
            Toast.makeText(getContext(),"List Cleared",Toast.LENGTH_SHORT).show();
        });
        return v;
    }

    public void random() {
        if (cus.size() != 0){
            Random r = new Random();
            int randomitem = r.nextInt(cus.size());
            String randomElement = cus.get(randomitem);
            mTextView.setText(randomElement);
        }
        else {
            Toast.makeText(getContext(),"Please add some item",Toast.LENGTH_SHORT).show();
        }
    }

    public void AddShow(){
        if (i == 0 && !ad.equals("")){
            sh += AddText.getText();
            i++;
        }
        else{
            if (!ad.equals("")){
                sh += " , " + AddText.getText();
            }
        }
    }

    public void Addtext(){
        ad = String.valueOf(AddText.getText());
        if (ad.equals(""))
            Toast.makeText(getContext(),"Please add some item",Toast.LENGTH_SHORT).show();
        else
            cus.add(ad);
    }
}