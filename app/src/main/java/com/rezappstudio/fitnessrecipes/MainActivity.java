package com.rezappstudio.fitnessrecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView bulkingCard = findViewById(R.id.card_view_bulking_recipes);
        CardView cuttingCard = findViewById(R.id.card_view_cutting_recipes);

        TextView title = findViewById(R.id.text_view_appname);
        title.setText("Main Menu");


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