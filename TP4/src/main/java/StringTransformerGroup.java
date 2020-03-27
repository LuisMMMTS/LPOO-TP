import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    List<StringTransformer> list;

    StringTransformerGroup(List<StringTransformer> list){
        this.list=list;
    }

    @Override
    public void execute(StringDrink drink){
        StringRecipe recipe=new StringRecipe(list);
        recipe.mix(drink);
    }
}
