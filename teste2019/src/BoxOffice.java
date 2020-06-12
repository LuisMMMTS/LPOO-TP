import java.util.ArrayList;
import java.util.List;

public class BoxOffice {
    public static List<Ticket> buy(Concert concert, int i) throws InvalidTicket {
        List<Ticket> tickets=new ArrayList<Ticket>();
        while (i>0){
            Ticket ticket=new Ticket(concert.getLastSold()+1,concert);
            concert.addTicket(ticket);
            tickets.add(ticket);
            i--;
        }
        return tickets;
    }
}
