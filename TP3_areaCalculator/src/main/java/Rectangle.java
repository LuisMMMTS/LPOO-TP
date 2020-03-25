public class Rectangle implements AreaShape {
    private double size1, size2;

    Rectangle(double size1,double size2){
        this.size1=size1;
        this.size2=size2;
    }

    public double getSides(int which_side) {
        if (which_side==1){
            return size1;
        }
        return size2;
    }

    public void setSide(double side1, double side2) {
        this.size1 = side1;
        this.size2 = side2;
    }

    @Override
    public void draw() {
        System.out.println("This is a Rectangle");
    }

    @Override
    public double getArea() {
        return size1*size2;
    }
}
