public class Circle implements AreaShape{
    private double radius;

    Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(this.radius,2)*Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
