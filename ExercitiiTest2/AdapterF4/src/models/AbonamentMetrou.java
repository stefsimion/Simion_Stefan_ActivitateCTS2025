package models;

public class AbonamentMetrou {

    private String nume;
    private int data;
    private boolean hasAcord;

    public AbonamentMetrou(String nume, int data, boolean hasAcord) {
        this.nume = nume;
        this.data = data;
        this.hasAcord = hasAcord;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isHasAcord() {
        return hasAcord;
    }

    public void setHasAcord(boolean hasAcord) {
        this.hasAcord = hasAcord;
    }

    public void printBiletMetrou(){
        System.out.println("Biletul este activ!");
    }
}
