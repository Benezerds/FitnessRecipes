package com.rezappstudio.fitnessrecipes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ProjectViewHolder> {
    private Recipes[] recipes;

    public ProjectsAdapter(Recipes[] recipes){
        this.recipes = recipes;
    }

    @Override
    public int getItemCount() {
        return recipes.length;
    }

    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recipes, parent, false);

        return new ProjectViewHolder(view);
    }

    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position){
        holder.bind(recipes[position]);
    }


    static class ProjectViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView recipeTitle;
        TextView recipeDescription;
        TextView calories;

        public ProjectViewHolder(@NonNull View itemView){
            super(itemView);
            image = itemView.findViewById(R.id.image_view_recipes_icon);
            recipeTitle = itemView.findViewById(R.id.text_view_recipes_title);
            recipeDescription = itemView.findViewById(R.id.text_view_recipe_details);
            calories = itemView.findViewById(R.id.text_view_calorie_number);
        }

        public void bind(Recipes recipes){
            image.setImageResource(recipes.recipeImage);
            recipeTitle.setText(recipes.title);
            recipeDescription.setText(recipes.description);
            this.calories.setText(recipes.calories);
        }
    }


}
