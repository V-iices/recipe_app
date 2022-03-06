package com.example.recipe_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int nummer = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView counter = findViewById(R.id.nummer);
        Button plusknop = findViewById(R.id.plus);
        Button minusknop = findViewById(R.id.minus);

        counter.setText("Tel af vanaf " + nummer);

        plusknop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nummer < 10) {
                    nummer++;
                    counter.setText("Tel af vanaf " + nummer);
                    plusknop.setEnabled(true);
                }
                else {
                    plusknop.setEnabled(false);
                }
            }
        });
        minusknop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nummer > 1) {
                    nummer--;
                    counter.setText("Tel af vanaf " + nummer);
                    plusknop.setEnabled(true);
                }
                else {
                    minusknop.setEnabled(false);
                }
            }
        });
    }
}