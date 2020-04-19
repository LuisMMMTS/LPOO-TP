public class StringInverter implements StringTransformer {

    @Override
    public void execute(StringDrink drink) {
        StringBuffer drinkfinale=new StringBuffer(drink.getText());
        drink.setText(drinkfinale.reverse().toString());
    }
}
