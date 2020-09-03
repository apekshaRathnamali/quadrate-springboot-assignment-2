package com.example.RecipeApplication.repository;

import com.example.RecipeApplication.model.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface RecipesRepository extends CrudRepository<Recipe, Integer> {
}
