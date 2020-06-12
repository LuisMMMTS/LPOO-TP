import java.util.Objects;

public class Ticket {
    private int number;
    private Concert concert;

    public Ticket(int number, Concert concert) throws InvalidTicket {
        if (number<=concert.getLastSold())
            throw new InvalidTicket();
        this.number = number;
        this.concert = concert;
        concert.addTicket(this);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Concert getConcert() {
        return concert;
    }

    public void setConcert(Concert concert) {
        this.concert = concert;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return number == ticket.number &&
                Objects.equals(concert, ticket.concert);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, concert);
    }
}
