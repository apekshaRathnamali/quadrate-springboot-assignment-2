package com.example.RecipeApplication.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long R_id;
    private String R_name;
    private String Description;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<Ingredient> ingredients = new HashSet<>( );
    public Recipe(){

    }

    public Recipe(long r_id, String r_name, String description) {
        this.R_id = r_id;
        this.R_name = r_name;
        this.Description = description;
    }

    public long getR_id() {
        return R_id;
    }

    public void setR_id(long r_id) {
        this.R_id = r_id;
    }

    public String getR_name() {
        return R_name;
    }

    public void setR_name(String r_name) {
        this.R_name = r_name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }
}



