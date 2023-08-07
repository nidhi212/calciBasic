package com.example.missioncamera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView finalresult;
    EditText num1, num2;
    Button add,sub,mul,div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.Number1);
        num2=findViewById(R.id.Number2);
        finalresult=findViewById(R.id.result);
        add=findViewById(R.id.plus);
        sub=findViewById(R.id.minus);
        mul=findViewById(R.id.multi);
        div=findViewById(R.id.div);

        //click new  V it will create view
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                int firstValue,secondValue,ans;

                firstValue = Integer.parseInt(num1.getText().toString());
                secondValue = Integer.parseInt(num2.getText().toString());

                ans= firstValue + secondValue;
                finalresult.setText("The final result is: "+ans);



            }


        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                int firstValue,secondValue,ans;

                firstValue = Integer.parseInt(num1.getText().toString());
                secondValue = Integer.parseInt(num2.getText().toString());

                ans= firstValue - secondValue;
                finalresult.setText("The final result is: "+ans);



            }


        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                int firstValue,secondValue,ans;

                firstValue = Integer.parseInt(num1.getText().toString());
                secondValue = Integer.parseInt(num2.getText().toString());

                ans= firstValue * secondValue;
                finalresult.setText("The final result is: "+ans);



            }


        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                int firstValue,secondValue,ans;

                firstValue = Integer.parseInt(num1.getText().toString());
                secondValue = Integer.parseInt(num2.getText().toString());

                ans= firstValue / secondValue;
                finalresult.setText("The final result is: "+ans);



            }


        });


    }
}