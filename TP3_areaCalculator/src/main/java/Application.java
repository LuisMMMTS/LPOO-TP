public class Application {
    void main(){
        AreaAggregator areaAggregator=new AreaAggregator();
        areaAggregator.addShape(new Circle(5));
        areaAggregator.addShape(new Square(20));
        areaAggregator.addShape(new Square(2));
        areaAggregator.addShape(new Circle(2));
        System.out.println(areaAggregator.output());
    }
}
