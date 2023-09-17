package com.example.allinone;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Age extends Fragment {
EditText input;
Button btn1;
TextView res,dob,today;
    public Age() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Context context=inflater.getContext();
        View v=inflater.inflate(R.layout.fragment_age, container, false);
        btn1=v.findViewById(R.id.btn);
        res=v.findViewById(R.id.res);
        input=v.findViewById(R.id.input);
        Calendar calendar= Calendar.getInstance();
       final int year= calendar.get(Calendar.YEAR);
        final int month=calendar.get(Calendar.MONTH);
        final int day=calendar.get(Calendar.DAY_OF_MONTH);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

           try {
               String dob = input.getText().toString().trim();
               int year=Calendar.getInstance().get(Calendar.YEAR);
               if(dob.isEmpty()){
                   Toast.makeText(getContext(), "Please enter a year", Toast.LENGTH_SHORT).show();
               }else if(dob.compareTo(String.valueOf(year))>0){
                   Toast.makeText(getContext(), "Year should be less than current year", Toast.LENGTH_SHORT).show();
               }else{
                   int age=year -Integer.parseInt(dob);
                   res.setText("Your Age is "+age+" years.");
               }
           }
           catch (Exception e){
               Log.d("error", "onClick: "+e);
           }


            {
            }
            }
        });

        return v;
    }
}