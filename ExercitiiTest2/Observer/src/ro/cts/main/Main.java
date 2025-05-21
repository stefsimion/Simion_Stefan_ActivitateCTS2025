package ro.cts.main;

import ro.cts.models.ClientFidel;
import ro.cts.models.Restaurant;

public class Main {
    public static void main(String[] args) {

        ClientFidel c1 = new ClientFidel("Andrei");
        ClientFidel c2 = new ClientFidel("Marius");
        ClientFidel c3 = new ClientFidel("George");
        Restaurant r1 = new Restaurant("2Frati");

        r1.adaugaObserver(c1);
        r1.adaugaObserver(c2);
        r1.ofertaNoua();
        r1.adaugaObserver(c3);
        r1.mesajMeniu();

    }
}