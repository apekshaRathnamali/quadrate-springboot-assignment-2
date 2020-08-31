package com.example.RecipeApplication.controller;

import com.example.RecipeApplication.model.Recipe;
import com.example.RecipeApplication.repository.RecipeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RecipeController {

    private final RecipeRepository recipeRepository;

    public RecipeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @RequestMapping(value = "/recipes")
    public String getRecipes(Model model){
        model.addAttribute( "recipes", recipeRepository.findAll() );
        return "recipes/list";
    }

}
