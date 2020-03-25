public class Triangle implements AreaShape {
    private double base, height;

    Triangle(double base, double height){
        this.base=base;
        this.height=height;
    }

    @Override
    public double getArea() {
        return this.base*this.height/2;
    }

    @Override
    public void draw() {
        System.out.println("Triangle");
    }
}
