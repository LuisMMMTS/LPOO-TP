import java.util.List;

public class StringRecipe {
    List<StringTransformer>list;

    StringRecipe(List<StringTransformer> list){
        this.list=list;
    }

    public void mix(StringDrink drink){
        for (int i=0;i<list.size();i++){
            list.get(i).execute(drink);
        }
    }
}
