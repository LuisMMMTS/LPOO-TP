import java.util.ArrayList;
import java.util.List;

public class Party extends Event{

    public Party(String title) {
        super(title);
    }

    public Party(String title, String date, String description) {
        super(title, date, description);
    }

    public Party(String title, String date) {
        super(title, date);
    }

    public Party(Event e) {
        super(e);
    }


    public void addEvent(Event e) {
        for (Person p:e.getAudience()){
            this.addPerson(p);
        }
    }
}
