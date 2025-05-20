package ro.cts.models;

public class Bilet implements IBilet {

    private int codBilet;
    private String numeClient;
    private int pret;

    public Bilet(int codBilet, String numeClient, int pret) {
        this.codBilet = codBilet;
        this.numeClient = numeClient;
        this.pret = pret;
    }

    public int getCodBilet() {
        return codBilet;
    }

    public void setCodBilet(int codBilet) {
        this.codBilet = codBilet;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public void printeazaBilet() {
        System.out.println("Biletul cu codul " + codBilet + " a fost printat!");
    }
}
