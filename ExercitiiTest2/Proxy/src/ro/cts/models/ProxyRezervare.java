package ro.cts.models;

public class ProxyRezervare implements IRezervare{

    private Rezervare rezervare;

    public ProxyRezervare(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    public Rezervare getRezervare() {
        return rezervare;
    }

    public void setRezervare(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva() {
        if(rezervare.getListaClienti().size() < 4) {
            System.out.println("Nu se poate face rezervarea va rugam veniti in restaurant!");
        }
        else {
            System.out.println("Rezervarea a fost efectuata!");
        }
    }
}
