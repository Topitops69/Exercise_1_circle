package com.example.exercise_1_circle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnActivity1, btnActivity2, btnActivity3, btnActivity4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActivity1 = (Button) findViewById(R.id.button2);
        btnActivity2 = (Button) findViewById(R.id.button4);
        btnActivity3 = (Button) findViewById(R.id.button6);
        btnActivity4 = (Button) findViewById(R.id.button7);

        btnActivity1.setOnClickListener(this);
        btnActivity2.setOnClickListener(this);
        btnActivity3.setOnClickListener(this);
        btnActivity4.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
//            case R.id.btnActivity1;
//                Toast.makeText()
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}