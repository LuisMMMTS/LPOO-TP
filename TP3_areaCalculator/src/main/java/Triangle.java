public class Triangle implements AreaShape {
    private float base, height;

    Triangle(float base, float height){
        this.base=base;
        this.height=height;
    }

    @Override
    public float getArea() {
        return this.base*this.height/2;
    }

    @Override
    public void draw() {
        System.out.println("Triangle");
    }
}
