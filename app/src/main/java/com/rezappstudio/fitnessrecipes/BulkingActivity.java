package com.rezappstudio.fitnessrecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class BulkingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulking);

        RecyclerView recipeList = findViewById(R.id.recycler_view_bulking_recipes);

        Recipes[] recipes = {
                new Recipes("Chicken & Rice", "Tasy recipes that is simple and easy to make", "500", R.drawable.chicken_rice),
                new Recipes("Fried Salmon", "Easy salmon menu just fry it", "613", R.drawable.fried_salmon)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(recipes);

        recipeList.setAdapter(adapter);
    }
}
