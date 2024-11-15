package Model.Class;

import Model.Enum.Genre;
import java.sql.Date;

public class Band extends Artist {

    int numberOfMember;

    public Band(String namaArtis, Genre genre, double performanceFee, int numberOfMember, Date startTime, Date endTime) {
        super(namaArtis, genre, performanceFee, startTime, endTime);
        this.numberOfMember = numberOfMember;
    }

    public int getNumberOfMember() {
        return numberOfMember;
    }
    public void setNumberOfMember(int numberOfMember) {
        this.numberOfMember = numberOfMember;
    }

    @Override
    public void getDetails() {
        System.out.println("BAND");
        System.out.println("Nama band: " + namaArtis);
        System.out.println("Genre lagu: " + genre);
        System.out.println("Jumlah member: " + numberOfMember);
        System.out.println("Harga: " + performanceFee);
        System.out.println("Start time: " + startTime);
        System.out.println("End time: " + endTime);
        System.out.println();
    }

}
