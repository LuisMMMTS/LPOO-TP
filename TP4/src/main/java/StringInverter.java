public class StringInverter implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        String to_invert=drink.getText();
        String inverted="";
        for (int i=to_invert.length()-1;i>=0;i--){
            inverted=inverted+to_invert.charAt(i);
        }
        drink.setText(inverted);
    }
}
