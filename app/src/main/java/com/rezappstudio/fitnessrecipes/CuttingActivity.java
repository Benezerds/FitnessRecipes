package com.rezappstudio.fitnessrecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class CuttingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cutting);

        RecyclerView recipeList = findViewById(R.id.recycler_view_bulking_recipes);

        Recipes[] recipes = {
                new Recipes("Chicken Salad", "Balance of greens and proteins, good for cutting", "200", R.drawable.chicken_salad),
                new Recipes("Salmon Salad", "Balance of greens and caesard salmon, tasty!", "450", R.drawable.salmon_salad)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(recipes);

        recipeList.setAdapter(adapter);
    }
}