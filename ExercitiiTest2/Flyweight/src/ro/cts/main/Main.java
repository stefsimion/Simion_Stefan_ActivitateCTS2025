package ro.cts.main;

import ro.cts.models.Client;
import ro.cts.models.FabricaRezervari;
import ro.cts.models.IRezervare;
import ro.cts.models.Rezervare;

public class Main {
    public static void main(String[] args) {

        FabricaRezervari fabrica = new FabricaRezervari();
        Client c1 = new Client("Andrei", "blabla@gmail.com", "04524124");

        IRezervare rezervare1 = fabrica.getRezervare(1);
        rezervare1.descrieRezervare(c1);
        fabrica.getRezervare(2).descrieRezervare(c1);

    }
}