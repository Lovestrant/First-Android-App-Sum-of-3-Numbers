package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Getting variable of elements
        TextView Num1 = findViewById(R.id.Num1);
        TextView Num2 = findViewById(R.id.Num2);
        TextView Num3 = findViewById(R.id.Num3);
        TextView answer = findViewById(R.id.Answer);


        Button myButton = findViewById(R.id.BtnAdd);


        //Initializing a click event on the button
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Getting first Number
                int first = Integer.parseInt(Num1.getText().toString());

                //Getting Second Number
                int second = Integer.parseInt(Num2.getText().toString());
                //getting third number
                int third = Integer.parseInt(Num3.getText().toString());
                //adding the three numbers
              int res = first+second+third;
             //displaying answer to frontEnd
               answer.setText(Integer.toString(res));
            }
        });

    }
}