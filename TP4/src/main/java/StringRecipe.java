import java.util.ArrayList;
import java.util.List;

public class StringRecipe {
    List<StringTransformer> recipes;

    StringRecipe (List recipes){
        this.recipes=recipes;
    }

    public void mix(StringDrink drink){
        for (int i=0;i<recipes.size();i++){
            recipes.get(i).execute(drink);
        }
    }
}
