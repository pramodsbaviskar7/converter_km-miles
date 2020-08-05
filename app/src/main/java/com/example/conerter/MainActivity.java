package com.example.conerter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    static EditText kmview,milesview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         Button kmtomiles = (Button) findViewById(R.id.kmtomiles);

        kmtomiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editkm = (EditText) findViewById(R.id.kmview);
                EditText editmiles = (EditText) findViewById(R.id.milesview);
               double km= Double.valueOf(editkm.getText().toString());
                double miles= km*0.621371;
                DecimalFormat decimalFormat=new DecimalFormat("##.##");
                editmiles.setText(decimalFormat.format(miles));

            }
        });
        Button milestokm = (Button) findViewById(R.id.milestokm);
        milestokm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editkm = (EditText) findViewById(R.id.kmview);
                 EditText editmiles = (EditText) findViewById(R.id.milesview);

                double miles=Double.valueOf(editmiles.getText().toString());
                double km = miles/0.621371;
                DecimalFormat decimalFormat=new DecimalFormat("##.##");
                editkm.setText(decimalFormat.format(km));

            }
        });
    }
}
