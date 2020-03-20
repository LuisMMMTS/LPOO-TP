public class Application {
    public static void main(String[] args) {
        AreaAggregator areaAggregator = new AreaAggregator();
        areaAggregator.addShape(new Circle(5));
        areaAggregator.addShape(new Square(20));
        areaAggregator.addShape(new Square(2));
        areaAggregator.addShape(new Circle(2));
        areaAggregator.addShape(new Triangle(1,1));

        System.out.println(new AreaStringOutputter(areaAggregator).output());
        System.out.println(new AreaXMLOutputter(areaAggregator).output());
    }
}