import java.util.ArrayList;
import java.util.List;

public abstract class Bar {
    boolean isHappyHour=false;
    List<BarObserver> observers;

    Bar(){
        observers=new ArrayList<BarObserver>();
    };

    public boolean isHappyHour() {
        return isHappyHour;
    }
    public void startHappyHour() {
        this.isHappyHour=true;
        this.notifyObservers();
    }
    public void endHappyHour() {
        this.isHappyHour=false;
        this.notifyObservers();
    }

    public void addObserver(BarObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }

}
