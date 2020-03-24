public class House implements HasArea {
    private double area;

    public House(double area) {
        this.area = area;
    }

    @Override
    public float getArea() {
        return (float) area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
