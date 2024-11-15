package Model.Class;

import java.sql.Date;

import Model.Enum.Genre;

abstract public class Artist {
    
    String namaArtis;
    Genre genre;
    double performanceFee;
    Date startTime;
    Date endTime;

    
    public Artist(String namaArtis, Genre genre, double performanceFee, Date startTime, Date endTime) {
        this.namaArtis = namaArtis;
        this.genre = genre;
        this.performanceFee = performanceFee;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    
    public String getNamaArtis() {
        return namaArtis;
    }
    public void setNamaArtis(String namaArtis) {
        this.namaArtis = namaArtis;
    }
    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    public double getPerformanceFee() {
        return performanceFee;
    }
    public void setPerformanceFee(double performanceFee) {
        this.performanceFee = performanceFee;
    }
    public Date getStartTime() {
        return startTime;
    }
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    public Date getEndTime() {
        return endTime;
    }
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    
    public abstract void getDetails();
}