package com.example.exercise_1_circle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity1CircleV1 extends AppCompatActivity {
    Button btnCalculate;
    TextView  txtArea, txtCircumference;
    EditText txtRadius;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1_circle_v1);

        btnCalculate = (Button) findViewById(R.id.btnCalculate);
        txtRadius = (EditText) findViewById(R.id.txtRadius);
        txtArea = (TextView) findViewById(R.id.txtArea);
        txtCircumference = (TextView) findViewById(R.id.txtCircumference);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieves the valu of the text view
                
                double radius = Integer.parseInt(String.valueOf(txtRadius));
                double area = Math.PI * Math.pow(radius,2);
                double circ = 2 * Math.PI * radius;
                
                //displays the value of the text view
                
                txtArea.setText(String.valueOf(area));
                txtCircumference.setText(String.valueOf(circ));

                Toast.makeText(Activity1CircleV1.this, "Area and Circumference of the Circle has been computed", Toast.LENGTH_SHORT).show();
                
            }
        });
    }


}