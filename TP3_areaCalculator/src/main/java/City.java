import java.util.ArrayList;
import java.util.List;

public class City implements SumProvider{
    List<House> list=new ArrayList<House>();
    City(List<House>list){
        this.list=list;
    }
    @Override
    public double sum(){
        double sum=0;
        for (House house:list){
            sum+=house.getArea();
        }
        return sum;
    }
}
