public class Speaker extends Person {
    private int fee=0;

    public Speaker(String name, int age) {
        super(name, age);
    }
    public Speaker(String name){
        super(name);
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Speaker " + this.getName() + " has a fee value of " + this.getFee() + ".";
    }
}
