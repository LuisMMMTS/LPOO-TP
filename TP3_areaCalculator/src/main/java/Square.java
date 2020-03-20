public class Square implements Shape {
    private float side;

    Square(float side){
        this.side=side;
    }

    public float getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(this.side,2);
    }

    @Override
    public void draw() {
        System.out.println("Square");
    }
}
