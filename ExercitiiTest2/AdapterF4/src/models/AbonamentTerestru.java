package models;

public class AbonamentTerestru {

    private String nume;
    private int data;

    public AbonamentTerestru(String nume, int data) {
        this.nume = nume;
        this.data = data;
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

    public void printBiletTerestru(){
        System.out.println("Biletul este activ!");
    }
}
