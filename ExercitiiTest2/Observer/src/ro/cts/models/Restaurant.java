package ro.cts.models;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subject{

    private List<Observer> clienti;
    private String nume;

    public Restaurant( String nume) {
        this.clienti = new ArrayList<Observer>();
        this.nume = nume;
    }

    @Override
    public void adaugaObserver(Observer observer) {
        clienti.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        clienti.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(Observer obs : clienti){
            obs.receptionareMesaj(mesaj);
        }
    }

    public void mesajMeniu(){
        trimiteNotificare("Am adauga un nou produs in meniu!");
    }

    public void ofertaNoua(){
        trimiteNotificare("Am adauga o noua oferta!");
    }

}
