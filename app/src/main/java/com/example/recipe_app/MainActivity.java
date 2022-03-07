package com.example.recipe_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int nummer = 1;
    int ei = 1;
    int bloem = 250;
    int melk = 25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView counter = findViewById(R.id.nummer);
        TextView recept = findViewById(R.id.recept);
        TextView receptnaam = findViewById(R.id.receptnaam);
        Button plusknop = findViewById(R.id.plus);
        Button minusknop = findViewById(R.id.minus);

        counter.setText("Pannenkoeken voor " + nummer + " persoon");
        recept.setText(ei + " ei" + "\n" + bloem + "g bloem" + "\n" + melk + "dl melk");
        receptnaam.setText("Pannenkoeken");

        plusknop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nummer >= 0) {
                    nummer++;
                    ei++;
                    bloem += 250;
                    melk += 25;
                    counter.setText("Pannenkoeken voor " + nummer + " personen");
                    recept.setText(ei + " ei" + "\n" + bloem + "g bloem" + "\n" + melk + "dl melk");
                }

            }
        });
        minusknop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nummer >= 2) {
                    nummer--;
                    ei--;
                    bloem -= 250;
                    melk -= 25;
                    counter.setText("Pannenkoeken voor " + nummer +" personen");
                    recept.setText(ei + " ei" + "\n" + bloem + "g bloem" + "\n" + melk + "dl melk");
                }
                if(nummer == 1){
                    counter.setText("Pannenkoeken voor " + nummer + " persoon");
                }
            }
        });
    }
}