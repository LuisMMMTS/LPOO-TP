public class StringCaseChanger implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        String to_invert=drink.getText();
        String inverted="";
        for (int i=0;i<to_invert.length();i++) {
            if (Character.isLowerCase(to_invert.charAt(i))) {
                inverted = inverted + Character.toUpperCase(to_invert.charAt(i));
            } else {
                inverted = inverted + Character.toLowerCase(to_invert.charAt(i));
            }
        }
        drink.setText(inverted);
    }
}
