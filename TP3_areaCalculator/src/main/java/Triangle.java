public class Triangle implements Shape {
    private float base, height;

    Triangle(float base, float height){
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
