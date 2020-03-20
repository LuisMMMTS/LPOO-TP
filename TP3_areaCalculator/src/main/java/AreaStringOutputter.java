public class AreaStringOutputter {
    AreaAggregator area;
    AreaStringOutputter(AreaAggregator area){
        this.area=area;
    }

    String output(){
        return "Sum of areas: "+area.sum();
    }
}
