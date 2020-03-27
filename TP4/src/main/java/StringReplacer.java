public class StringReplacer implements StringTransformer{
    char old;
    char replacer;

    StringReplacer(char old, char replacer){
        this.old=old;
        this.replacer=replacer;
    }


    @Override
    public void execute(StringDrink drink) {
        /*String to_change=drink.getText();
        String changed="";
        for (int i=0;i<to_change.length();i++) {
            if (to_change.charAt(i)==old) {
                changed = changed + replacer;
            } else {
                changed = changed + to_change.charAt(i);
            }
        }*/
        drink.setText(drink.getText().replace(old,replacer));

    }
}
