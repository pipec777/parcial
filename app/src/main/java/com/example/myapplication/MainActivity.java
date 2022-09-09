package com.example.myapplication;
import android.annotation.SuppressLint;
import android.icu.text.CollationKey;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView sum1;
    TextView sum2;
    Button pares;
    Button imp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sum1= findViewById(R.id.sum1);
        pares= findViewById(R.id.par);
        pares.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int val1 = random.nextInt(100);
                int val2 = random.nextInt(100);
                if((val1%2)==0)
                sum1.setText(Integer.toString(val1));
                sum2.setText(Integer.toString(val2));
            }
        });
        sum2= findViewById(R.id.sum2);
        imp = findViewById(R.id.impar);
        imp.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int val3 = random.nextInt(100);
                int val4 = random.nextInt(100);
                sum1.setText(Integer.toString(val3));
                sum2.setText(Integer.toString(val4));

            }
        });


    }
}