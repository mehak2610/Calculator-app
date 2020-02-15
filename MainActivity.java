package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2;
    Button btnPlus,btnDiff,btnMul,btnDiv;
    TextView TextViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);
        btnPlus=findViewById(R.id.btnPlus);
        btnDiff=findViewById(R.id.btnDiff);
        btnMul=findViewById(R.id.btnMul);
        btnDiv=findViewById(R.id.btnDiv);
        TextViewResult=findViewById(R.id.TextViewResult);
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(editText1.getText().toString());
                int num2=Integer.parseInt(editText2.getText().toString());
                int result=num1+num2;
                String ans=Integer.toString(result);

                TextViewResult.setText(ans);
            }
        });
        btnDiff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(editText1.getText().toString());
                int num2=Integer.parseInt(editText2.getText().toString());
                int result=num1-num2;
                String ans=Integer.toString(result);

                TextViewResult.setText(ans);
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(editText1.getText().toString());
                int num2=Integer.parseInt(editText2.getText().toString());
                int result=num1*num2;
                String ans=Integer.toString(result);

                TextViewResult.setText(ans);
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(editText1.getText().toString());
                int num2=Integer.parseInt(editText2.getText().toString());
                int result=num1/num2;
                String ans=Integer.toString(result);

                TextViewResult.setText(ans);
            }
        });
    }
}
