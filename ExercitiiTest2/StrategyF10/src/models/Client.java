package models;

public class Client {

    private String nume;
    private ModPlata modPlata;

    public Client(String nume, ModPlata modPlata) {
        this.nume = nume;
        this.modPlata = modPlata;
    }

    public void plateste(double suma){
        modPlata.plateste(this, suma);
    }
}
