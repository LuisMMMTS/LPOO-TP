import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Concert {
    private String city;
    private String country;
    private String date;
    private int lastTicketSoldId=0;
    private List<Act> acts= new ArrayList<Act>();

    public Concert(String city, String country, String date) {
        this.city = city;
        this.country = country;
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Act> getActs() {
        return acts;
    }

    public void setActs(List<Act> acts) {
        this.acts = acts;
    }

    public void addAct(Act act){
        this.acts.add(act);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Concert concert = (Concert) o;
        return Objects.equals(city, concert.city) &&
                Objects.equals(country, concert.country) &&
                Objects.equals(date, concert.date) &&
                Objects.equals(acts, concert.acts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, country, date, acts);
    }


    public boolean isValid(Ticket ticket) throws InvalidTicket {
        if (ticket.getConcert().equals(this)) {
            return true;
        }
        throw new InvalidTicket();

        }

    public boolean participates(Artist artist) {
        for (Act act:this.acts){
            if (act instanceof Band){
                Band band= (Band) act;
                if (band.containsArtist(artist)){
                    return true;
                }
            }else if (artist.equals((Artist) act)){
                return true;
            }
        }
        return false;
    }

    public int getLastTicketSoldId() {
        return lastTicketSoldId;
    }

    public void setLastTicketSoldId(int lastTicketSoldId) {
        this.lastTicketSoldId = lastTicketSoldId;
    }
}
