package com.example.RecipeApplication.controller;

import com.example.RecipeApplication.model.Recipe;
import com.example.RecipeApplication.repository.RecipesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RecipeController {

    private final RecipesRepository recipesRepository;

    public RecipeController(RecipesRepository recipeRepository) {
        this.recipesRepository = recipeRepository;
    }

    @RequestMapping(value = "/recipe")
    public String getRecipes(Model model){
        model.addAttribute( "recipes", recipesRepository.findAll() );
        return "recipe/list";
    }
    @RequestMapping("/addRecipe")
    public String AddNewRecipe(Model model) {
        Recipe recipe = new Recipe();
        model.addAttribute("recipe", recipe);

        return "recipe/addRecipe";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveRecipe(@ModelAttribute("recipe") Recipe recipe) {
        recipesRepository.save(recipe);

        return "redirect:/recipe";
    }

}
