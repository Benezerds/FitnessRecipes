package com.rezappstudio.fitnessrecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView bulkingCard = findViewById(R.id.card_view_bulking_recipes);
        CardView cuttingCard = findViewById(R.id.card_view_cutting_recipes);


        bulkingCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent bulkingIntent = new Intent(MainActivity.this, BulkingActivity.class);

                startActivity(bulkingIntent);
            }
        });

        cuttingCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent cuttingIntent = new Intent(MainActivity.this, CuttingActivity.class);

                startActivity(cuttingIntent);
            }
        });

    }
}