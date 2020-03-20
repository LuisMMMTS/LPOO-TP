import java.util.ArrayList;
import java.util.List;

public class BoxOffice {

    public static List<Ticket> buy(Concert concert, int quantity) throws InvalidTicket {
        List<Ticket>tickets=new ArrayList<Ticket>();
        for (int i=0;i<quantity;i++){
            tickets.add(new Ticket(concert.getLastTicketSoldId()+1,concert));
            concert.setLastTicketSoldId(concert.getLastTicketSoldId()+1);
        }
        return tickets;
    }
}
