public class AreaStringOutputter {
    SumProvider sumProvider;
    AreaStringOutputter(SumProvider sumProvider){
        this.sumProvider=sumProvider;
    }

    String output(){
        return "Sum of areas: "+sumProvider.sum();
    }
}
