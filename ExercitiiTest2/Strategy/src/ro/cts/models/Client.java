package ro.cts.models;

public class Client {

    private String nume;
    private ModPlata modPlata;

    public void plateste(double suma){
        modPlata.plateste(this.nume,suma);
    }

    public Client(String nume) {
        this.nume = nume;
        this.modPlata = new Cash();
    }

    public Client(String nume, ModPlata modPlata) {
        this.nume = nume;
        this.modPlata = modPlata;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public ModPlata getModPlata() {
        return modPlata;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }
}
