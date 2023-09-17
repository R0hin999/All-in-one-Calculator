package com.example.allinone;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class simple extends Fragment {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bdot,bequal,bsub,badd,bmul,bdiv
            ,bac,bc,bb1,bb2,bsqrt;
    TextView tvsm,tvlg;
    String pi="3.14159265";
    public simple() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Context context = inflater.getContext();

        View v= inflater.inflate(R.layout.fragment_simple, container, false);
        b0=v.findViewById(R.id.b0);
        b1=v.findViewById(R.id.b1);
        b2=v.findViewById(R.id.b2);
        b3=v.findViewById(R.id.b3);
        b4=v.findViewById(R.id.b4);
        b5=v.findViewById(R.id.b5);
        b6=v.findViewById(R.id.b6);
        b7=v.findViewById(R.id.b7);
        b8=v.findViewById(R.id.b8);
        b9=v.findViewById(R.id.b9);
        bdot=v.findViewById(R.id.bdot);
        bequal=v.findViewById(R.id.bequal);
        bsub=v.findViewById(R.id.bsub);
        badd=v.findViewById(R.id.badd);
        bmul=v.findViewById(R.id.bmul);
        bdiv=v.findViewById(R.id.bdiv);

        bc =v.findViewById(R.id.bc);
        bac =v.findViewById(R.id.bac);
        bb1 =v.findViewById(R.id.bb1);
        bb2 =v.findViewById(R.id.bb2);
        tvsm=v.findViewById(R.id.tvsm);
        tvlg=v.findViewById(R.id.tvlg);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvlg.setText(tvlg.getText()+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvlg.setText(tvlg.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvlg.setText(tvlg.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvlg.setText(tvlg.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvlg.setText(tvlg.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvlg.setText(tvlg.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvlg.setText(tvlg.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvlg.setText(tvlg.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvlg.setText(tvlg.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvlg.setText(tvlg.getText()+"9");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvlg.setText(tvlg.getText()+".");
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    tvlg.setText("");
                    tvsm.setText("");
                }
                catch (Exception e){
                    Toast.makeText(context, "Invalid input", Toast.LENGTH_SHORT).show();
                }
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String str=tvlg.getText().toString();
                    str=str.substring(0,str.length()-1);
                    tvlg.setText(str);}
                catch (Exception e){
                    Toast.makeText(context, "Nothing to clear", Toast.LENGTH_SHORT).show();
                }
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String str=tvlg.getText().toString();
                    String str2= String.valueOf(str.charAt(str.length()-1));
                    if (!str2.equals("+")){
                        tvlg.setText(tvlg.getText()+"+");
                    }else{
                        Toast.makeText(context, "invalid input", Toast.LENGTH_SHORT).show();
                    }
                }
                catch (Exception e){
                    Toast.makeText(context, "Invalid Input", Toast.LENGTH_SHORT).show();
                }

            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String str = tvlg.getText().toString();
                    String str2 = String.valueOf(str.charAt(str.length() - 1));
                    if (!str2.equals("-")) {
                        tvlg.setText(tvlg.getText() + "-");
                    } else {
                        Toast.makeText(context, "invalid input", Toast.LENGTH_SHORT).show();
                    }
                }
                catch (Exception e){
                    Toast.makeText(context, "Invalid Input", Toast.LENGTH_SHORT).show();
                }

            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String str = tvlg.getText().toString();
                    String str2 = String.valueOf(str.charAt(str.length() - 1));
                    if (!str2.equals("*")) {
                        tvlg.setText(tvlg.getText() + "*");
                    } else {
                        Toast.makeText(context, "invalid input", Toast.LENGTH_SHORT).show();
                    }
                }catch (Exception e){
                    Toast.makeText(context, "Invalid Input", Toast.LENGTH_SHORT).show();
                }

            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String str=tvlg.getText().toString();
                    String str2= String.valueOf(str.charAt(str.length()-1));
                    if (!str2.equals("/")){
                        tvlg.setText(tvlg.getText()+"/");
                    }else{
                        Toast.makeText(context, "invalid input", Toast.LENGTH_SHORT).show();
                    }
                }catch (Exception e)
                {
                    Toast.makeText(context, "Invalid Input", Toast.LENGTH_SHORT).show();

                }

            }
        });

        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvlg.setText(tvlg.getText()+"(");
            }
        });
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvlg.setText(tvlg.getText()+")");
            }
        });




        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=tvlg.getText().toString();
                Double res= Calc(str);
//                String str2=res.toString();
//                if (str2.lastIndexOf(".0")){
//                int i= Integer.parseInt(str2);
//                }
//                tvlg.setText(String.valueOf(i));
                tvlg.setText(String.valueOf(res));
                tvsm.setText(str);
            }
        });
        return v;
    }

    public static double Calc(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }

}