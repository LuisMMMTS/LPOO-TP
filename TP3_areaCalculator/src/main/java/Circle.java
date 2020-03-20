public class Circle implements Shape{
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
    public double getArea() {
        return Math.pow(this.radius,2)*Math.PI;
    }
}
