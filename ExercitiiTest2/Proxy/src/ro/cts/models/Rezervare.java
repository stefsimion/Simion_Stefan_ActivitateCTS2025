package ro.cts.models;

import java.util.List;

public class Rezervare implements IRezervare{

    private List<Client> listaClienti;

    public Rezervare(List<Client> listaClienti) {
        this.listaClienti = listaClienti;
    }

    public List<Client> getListaClienti() {
        return listaClienti;
    }

    public void setListaClienti(List<Client> listaClienti) {
        this.listaClienti = listaClienti;
    }

    @Override
    public void rezerva() {
        System.out.println("Rezervarea a fost efectuata");
    }
}
