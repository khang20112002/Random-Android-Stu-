package com.example.duongchikhang_se161156_lab21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText nhapMin, nhapMax;
    Button btnRandom;
    TextView ketQua;

    int number;
    int soNho;
    int soLon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nhapMin = (EditText) findViewById(R.id.nhapMin);
        nhapMax = (EditText) findViewById(R.id.nhapMax);
        btnRandom = (Button) findViewById(R.id.btnRandom);
        ketQua = (TextView) findViewById(R.id.ketQua);

        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (nhapMin.getText().toString().isEmpty() || nhapMax.getText().toString().isEmpty())
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                else {
                    soNho = Integer.parseInt(nhapMin.getText().toString());
                    soLon = Integer.parseInt(nhapMax.getText().toString());
                    if (soLon < soNho)
                        Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                    else {
                        Random random = new Random();
                        number = random.nextInt(soLon - soNho + 1) + soNho;
                        ketQua.setText(String.valueOf(number));
                    }

                }
            }
        });
    }
}