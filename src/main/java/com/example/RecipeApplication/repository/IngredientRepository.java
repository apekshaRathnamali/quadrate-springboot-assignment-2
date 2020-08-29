package com.example.RecipeApplication.repository;

import com.example.RecipeApplication.model.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends CrudRepository <Ingredient,Long> {

}
