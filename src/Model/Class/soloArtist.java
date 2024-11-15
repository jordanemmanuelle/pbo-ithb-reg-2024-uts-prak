package Model.Class;

import Model.Enum.Genre;
import java.sql.Date;

public class soloArtist extends Artist {

    String assistantName;

    public soloArtist(String namaArtis, Genre genre, double performanceFee, String assistantName, Date startTime, Date endTime) {
        super(namaArtis, genre, performanceFee, startTime, endTime);
        this.assistantName = assistantName;
    }

    public String getAssistantName() {
        return assistantName;
    }
    public void setAssistantName(String assistantName) {
        this.assistantName = assistantName;
    }

    @Override
    public void getDetails() {
        System.out.println("SOLO ARTIST");
        System.out.println("Nama artis: " + namaArtis);
        System.out.println("Genre lagu: " + genre);
        System.out.println("Asisten: " + assistantName);
        System.out.println("Harga: " + performanceFee);
        System.out.println("Start time: " + startTime);
        System.out.println("End time: " + endTime);
        System.out.println();
    }
}
