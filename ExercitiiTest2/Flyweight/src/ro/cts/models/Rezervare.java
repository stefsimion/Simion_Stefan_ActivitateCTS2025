package ro.cts.models;

public class Rezervare implements IRezervare{

    private int nrMasa;
    private int nrPersoane;
    private int ora;

    public Rezervare(int nrMasa, int nrPersoane, int ora) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.ora = ora;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public int getOra() {
        return ora;
    }

    public void setOra(int ora) {
        this.ora = ora;
    }

    @Override
    public void descrieRezervare(Client client) {
        System.out.println("Rezervarea facuta de " + client.getNume() + " la ora " + ora +
                " este la masa " + nrMasa + " si este de " + nrPersoane + " persoane!");
    }
}
