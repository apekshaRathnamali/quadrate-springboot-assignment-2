package com.example.RecipeApplication.bootstrap;

import com.example.RecipeApplication.model.Recipe;
import com.example.RecipeApplication.repository.RecipesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InsertingData implements CommandLineRunner {
    private final RecipesRepository recipesRepository;

    public InsertingData(RecipesRepository recipesRepository) {
        this.recipesRepository = recipesRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Recipe recipe1 = new Recipe(  );
        recipe1.setId(112);
        recipe1.setName( "Perfect Guacamole" );
        recipe1.setDescription( "Using a fork, roughly mash the avocado. Then Add salt, lime juice, and the rest: Sprinkle with salt and lime (or lemon) juice. Then add the chopped onion, cilantro, black pepper, and chillies. Refrigerate until ready to serve." );
        recipe1.setIngredients( "Salt, Pepper" );
        recipesRepository.save( recipe1 );

    }

}
