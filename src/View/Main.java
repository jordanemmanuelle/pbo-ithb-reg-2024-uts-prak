package View;

import Model.Class.*;
import Model.Enum.*;

import java.sql.Date;

import Controller.*;

public class Main {
    public static void main(String[] args) {
        Date startTime1 = Date.valueOf("2024-11-15");
        Date endTime1 = Date.valueOf("2024-11-15");

        Date startTime2 = Date.valueOf("2024-11-16");
        Date endTime2 = Date.valueOf("2024-11-16");

        Date startTime3 = Date.valueOf("2024-11-17");
        Date endTime3 = Date.valueOf("2024-11-17");

        Date startTime4 = Date.valueOf("2024-11-19");
        Date endTime4 = Date.valueOf("2024-11-19");

        
        
        Artist artis1 = new soloArtist("Silverstone", Genre.CLASSICAL, 5000000, "Mike", startTime1, endTime1);
        Artist artis2 = new soloArtist("Bruno Mars", Genre.POP, 20000000, "Kevin", startTime2, endTime2);
        Artist artis3 = new Band("Jarb", Genre.ROCK, 2000000, 3, startTime3, endTime3);
        Artist artis4 = new Band("BLACKPINK", Genre.POP, 35000000, 4, startTime4, endTime4);
        
        System.out.println("MUSIC FESTIVAL ORGANIZER");
        System.out.println("------------------------");
        artis1.getDetails();
        artis2.getDetails();
        artis3.getDetails();
        artis4.getDetails();

        Vendor vendor1 = new Vendor("Vendor A", "Makanan", 12000000);
        Vendor vendor2 = new Vendor("Vendor B", "Minuman", 10000000);

        System.out.println("VENDOR");
        System.out.println("------");
        vendor1.getVendorDetail();
        vendor2.getVendorDetail();
       

        for (int r = 1; r <= 25; r++) {
            Ticket tiket = new Ticket(TicketType.REGULAR, 150000, "r");
        }
        for (int v = 1; v <= 20; v++) {
            Ticket tiket = new Ticket(TicketType.VIP, 350000, "v");
        }
        for (int i = 1; i <= 15; i++) {
            Ticket tiket = new Ticket(TicketType.INVITATION, 10000, "i");
        }

        
        int countR = 0;
        int countV = 0;
        int countI = 0;

        
    }
}
