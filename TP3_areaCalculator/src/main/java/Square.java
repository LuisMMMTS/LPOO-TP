public class Square implements AreaShape {
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
    public float getArea() {
        return (float) Math.pow(this.side,2);
    }

    @Override
    public void draw() {
        System.out.println("Square");
    }
}
