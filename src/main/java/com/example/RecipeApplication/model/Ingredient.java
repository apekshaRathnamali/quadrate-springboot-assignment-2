package com.example.RecipeApplication.model;

import javax.persistence.*;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long I_Id;
    private String I_Name;

    @ManyToOne
    private Recipe recipe;

    public Ingredient(){

    }

    public Ingredient(long i_Id, String i_Name) {
        this.I_Id = i_Id;
        this.I_Name = i_Name;
    }

    public long getI_Id() {
        return I_Id;
    }

    public void setI_Id(long i_Id) {
        this.I_Id = i_Id;
    }

    public String getI_Name() {
        return I_Name;
    }

    public void setI_Name(String i_Name) {
        this.I_Name = i_Name;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
