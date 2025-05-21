package ro.cts.models;

public class ClientFidel implements Observer{

    private String nume;

    public ClientFidel(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println(nume + " ai primit notificare: " + mesaj);
    }
}
