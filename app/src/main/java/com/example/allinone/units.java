package com.example.allinone;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class units extends Fragment {
EditText input;
Spinner selunits;
TextView km, m, cm, mm, microm, nm, mile, yard, foot, inch;

    public units() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Context context=inflater.getContext();
        View v= inflater.inflate(R.layout.fragment_units, container, false);
        input=v.findViewById(R.id.input);
        selunits=v.findViewById(R.id.selunits);
        km=v.findViewById(R.id.km);
        m=v.findViewById(R.id.m);
        cm=v.findViewById(R.id.cm);
        mm=v.findViewById(R.id.mm);
        microm=v.findViewById(R.id.microm);
        nm=v.findViewById(R.id.nm);
        mile=v.findViewById(R.id.mile);
        yard=v.findViewById(R.id.yard);
        foot=v.findViewById(R.id.foot);
        inch=v.findViewById(R.id.inch );
        String[] arr={"km", "m", "cm", "mm", "microm", "nm", "mile", "yard", "foot", "inch"};
        selunits.setAdapter(new ArrayAdapter(getContext(),android.R.layout.simple_list_item_1,arr));
        selunits.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
update();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                update();
            }
        });

        return  v;
    }
   private void  update(){
        if(!input.getText().toString().equals("")&& !selunits.getSelectedItem().toString().equals("")){
            double in =Double.parseDouble(input.getText().toString());
            switch (selunits.getSelectedItem().toString()){
                case "km":
                    setkm(in);
                    break;
                case "m":
                    setkm(in/1000);
                    break;
                case "cm":
                    setkm(in/100000);
                    break;
                case "mm":
                    setkm(in/1000000);
                    break;
                case "microm":
                    setkm(in/1000000000);
                case "nm":
                    double d=1000000 * 1000000;
                    setkm(in/d);
                    break;
                case "mile":
                    setkm(in*1.609);
                    break;
                case "yard":
                    setkm(in/1094);
                    break;
                case "foot":
                    setkm(in/3281);
                    break;
                case "inch":
                    setkm(in/39370);
                    break;



            }
        }
   }

    private void setkm(double km_in) {
        km.setText(String.valueOf(km_in));
        m.setText(String.valueOf(km_in*1000));
        cm.setText(String.valueOf(km_in * 100000));
        mm.setText(String.valueOf(km_in * 10000000));
        microm.setText(String.valueOf(km_in * 1000000000));
        nm.setText(String.valueOf(km_in * 1000000 * 1000000));
mile.setText(String.valueOf(km_in/1.609));
yard.setText(String.valueOf(km_in*1094));
foot.setText(String.valueOf(km_in*3281));
inch.setText(String.valueOf(km_in*39370));
    }
}