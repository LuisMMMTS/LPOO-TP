public class StringReplacer implements StringTransformer{
    private char old, replacer;

    StringReplacer(char old, char replacer){
        this.old=old;
        this.replacer=replacer;
    }

    @Override
    public void execute(StringDrink drink) {
        drink.setText(drink.getText().replace(old,replacer));
    }

    @Override
    public void undo(StringDrink drink) {
        drink.setText(drink.getText().replace(replacer,old));
    }
}
