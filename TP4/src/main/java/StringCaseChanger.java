public class StringCaseChanger implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        StringBuffer finale=new StringBuffer(drink.getText());
        for (int i=0;i<finale.length();i++){
            if (Character.isLowerCase(finale.charAt(i))){
                finale.replace(i,i+1, String.valueOf(Character.toUpperCase(finale.charAt(i))));
            }else{
                finale.replace(i,i+1, String.valueOf(Character.toLowerCase(finale.charAt(i))));
            }
        }
        drink.setText(finale.toString());
    }

    @Override
    public void undo(StringDrink drink) {
        this.execute(drink);
    }
}
