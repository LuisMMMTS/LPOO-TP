public class Line implements Shape {
    private float length;

    Line(float length){
        this.length=length;
    }


    @Override
    public void draw() {
        System.out.println("LINE");
    }
}
