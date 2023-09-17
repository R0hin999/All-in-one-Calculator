package com.example.allinone;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class SgpaToPerc extends Fragment {
EditText input;
TextView res;
Button btn;
    public SgpaToPerc() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Context context=inflater.getContext();
        View v=inflater.inflate(R.layout.fragment_sgpa_to_perc, container, false);
        btn=v.findViewById(R.id.btn);
        input=v.findViewById(R.id.input);
        res=v.findViewById(R.id.res);
btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
try {
    String n = input.getText().toString();

    double SGPA=Double.parseDouble(n);
    double perc=Math.round((SGPA*10)-7.5 );

    res.setText(String.valueOf(String.valueOf(perc) + "%"));

}catch(Exception e) {
            Toast.makeText(context, "Please Enter SGPA", Toast.LENGTH_SHORT).show();
        }
        }
});

        return v;
    }
}