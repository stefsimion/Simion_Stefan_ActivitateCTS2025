package cts.main;

import cts.clase.PachetTuristic;
import cts.fabrici.CazareFactory;
import cts.fabrici.PachetTuristicFactory;
import cts.fabrici.TipCazare;
import cts.fabrici.TipTransport;
import cts.fabrici.TransportFactory;

public class Main {
    public static void main(String[] args) {
        PachetTuristicFactory fabrica=new CazareFactory();
        PachetTuristicFactory fabricaTransport=new TransportFactory();

        PachetTuristic pachet=fabrica.crearePachet(TipCazare.CazareCabana);
        pachet.descriere();
        pachet=fabricaTransport.crearePachet(TipTransport.TransportTren);
        pachet.descriere();

    }
}