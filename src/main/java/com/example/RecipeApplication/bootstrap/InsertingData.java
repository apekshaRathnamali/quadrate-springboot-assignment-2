package com.example.RecipeApplication.bootstrap;

import com.example.RecipeApplication.model.Recipe;
import com.example.RecipeApplication.repository.RecipeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InsertingData implements CommandLineRunner {
    private final RecipeRepository recipeRepository;

    public InsertingData(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Recipe recipe1 = new Recipe(  );
        recipe1.setR_id( 176376376 );
        recipe1.setR_name( "Perfect Guacamole" );
        recipe1.setDescription( "Using a fork, roughly mash the avocado. Then Add salt, lime juice, and the rest: Sprinkle with salt and lime (or lemon) juice. Then add the chopped onion, cilantro, black pepper, and chillies. Refrigerate until ready to serve." );

        recipeRepository.save( recipe1 );

    }

}
