package com.example.actividad2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView res;
    TextView sum1;
    TextView sum2;
    TextView sum3;
    Button ran;
    Button add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sum1= findViewById(R.id.suma1);
        sum2= findViewById(R.id.suma2);
        sum3= findViewById(R.id.suma3);
        add = findViewById(R.id.resul);
        add.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                int n1, n2 ,n3 ,sum;
                n1 = Integer.parseInt(res.getText().toString());
                n2 = Integer.parseInt(res.getText().toString());
                n3 = Integer.parseInt(res.getText().toString());
                sum= n1+ n2 +n3 ;
                sum1.setText(Integer.toString(sum));
                sum2.setText(Integer.toString(sum));
                sum3.setText(Integer.toString(sum));

            }
        });
        res = findViewById(R.id.naleatorio);
        ran = findViewById(R.id.aleatorio);
        ran.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int val = random.nextInt(100);
                res.setText(Integer.toString(val));

            }
        });


    }
}