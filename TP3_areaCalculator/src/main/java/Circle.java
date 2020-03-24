public class Circle implements AreaShape{
    private float radius;

    Circle(float radius){
        this.radius=radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (Math.pow(this.radius,2)*Math.PI);
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
