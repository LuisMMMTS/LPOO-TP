import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        AreaAggregator aggregator = new AreaAggregator();

        aggregator.addShape(new Square(10));
        aggregator.addShape(new Circle(5));
        aggregator.addShape(new Circle(2));
        aggregator.addShape(new Elipse(2, 3));
        aggregator.addShape(new Rectangle(10, 5));
        aggregator.addShape(new Triangle(10, 2));
        aggregator.addShape(new House(100));


        System.out.println(new AreaStringOutputter(aggregator).output());
        System.out.println(new AreaXMLOutputter(aggregator).output());


        List<House> houses = new ArrayList<>();
        houses.add(new House(50));
        houses.add(new House(150));

        City city = new City(houses);

        AreaStringOutputter cityStringOutputter = new AreaStringOutputter(city);
        AreaXMLOutputter cityXmlOutputter = new AreaXMLOutputter(city);

        System.out.println(cityStringOutputter.output());
        System.out.println(cityXmlOutputter.output());
    }

}