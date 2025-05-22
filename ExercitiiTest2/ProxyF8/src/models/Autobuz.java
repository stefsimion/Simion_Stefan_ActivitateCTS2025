package models;

public class Autobuz implements IAutobuz{

    private int nrLinie;
    private int nrOameni;

    public Autobuz(int nrLinie, int nrOameni) {
        this.nrLinie = nrLinie;
        this.nrOameni = nrOameni;
    }

    public int getNrOameni() {
        return nrOameni;
    }

    @Override
    public void oprire() {
        System.out.println("Autobuzul opreste in statie!");
    }
}
