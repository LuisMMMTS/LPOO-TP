import java.util.ArrayList;
import java.util.List;

public class City {
    List<House> list=new ArrayList<House>();
    City(List<House>list){
        this.list=list;
    }
    float sum(){
        float sum=0;
        for (House house:list){
            sum+=house.getArea();
        }
        return sum;
    }
}
