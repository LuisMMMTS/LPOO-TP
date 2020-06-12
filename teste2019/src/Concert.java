import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Concert {
    private String city;
    private String country;
    private String date;
    private List<Act> acts = new ArrayList<Act>();
    private List<Ticket> tickets = new ArrayList<Ticket>();
    private int lastSold=0;

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

    public void addAct(Act act) {
        this.acts.add(act);
    }

    public List<Act> getActs() {
        return acts;
    }

    public void setActs(List<Act> acts) {
        this.acts = acts;
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

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public void addTicket(Ticket ticket){
        this.tickets.add(ticket);
        this.lastSold=ticket.getNumber();
    }

    public boolean isValid(Ticket ticket){
        for (Ticket tick:this.tickets){
            if (tick.equals(ticket)){
                return true;
            }
        }
        return false;
    }

    public boolean participates(Artist artist) {
        for (Act a:this.acts){
            if (a.containsArtist(artist)){
                return true;
            }
        }
        return false;
    }

    public int getLastSold() {
        return lastSold;
    }

    public void setLastSold(int lastSold) {
        this.lastSold = lastSold;
    }
}
