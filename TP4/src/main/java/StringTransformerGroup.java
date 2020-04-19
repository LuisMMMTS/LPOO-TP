import javax.xml.transform.Transformer;
import java.util.List;

public class StringTransformerGroup implements StringTransformer {
    private List <StringTransformer> group;

    StringTransformerGroup(List<StringTransformer> group){
        this.group=group;
    }

    public void execute(StringDrink drink){
        for (int i=0;i<group.size();i++){
            group.get(i).execute(drink);
        }
    }

    @Override
    public void undo(StringDrink drink) {
        for (int i=group.size()-1;i>=0;i--){
            group.get(i).undo(drink);
        }
    }
}
