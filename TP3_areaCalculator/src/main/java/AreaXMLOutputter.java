public class AreaXMLOutputter {
    AreaAggregator area;

    AreaXMLOutputter(AreaAggregator area){
        this.area=area;
    }

    String output(){
        return "<area>"+area.sum()+"</area>";
    }

}
