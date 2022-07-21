package guru.springframework.service;

import guru.springframework.commands.RecipeCommand;
import guru.springframework.domain.Recipe;

import javax.transaction.Transactional;
import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    @Transactional
    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
