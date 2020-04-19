import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy{
    List<StringDrink> drinksToOrder;
    List<StringRecipe> recipesToUse;

    public SmartStrategy() {
        drinksToOrder = new ArrayList<>();
        recipesToUse = new ArrayList<>();
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if (bar.isHappyHour()) bar.order(drink, recipe);
        else {
            drinksToOrder.add(drink);
            recipesToUse.add(recipe);
        }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        for (int i = 0; i < drinksToOrder.size(); i++)
            bar.order(drinksToOrder.get(i), recipesToUse.get(i));
        drinksToOrder.clear();
        recipesToUse.clear(); //there is no risk of concurrency with function wants since if is happy hour wants does not append to list instead it just orders
    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
