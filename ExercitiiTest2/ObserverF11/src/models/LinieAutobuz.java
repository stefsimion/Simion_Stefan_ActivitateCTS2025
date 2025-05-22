package models;

import java.util.ArrayList;
import java.util.List;

public class LinieAutobuz implements Subject{
    private int nr;

    private List<Observer> lista;

    public LinieAutobuz(int nr) {
        this.nr = nr;
        this.lista = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer obs) {
        lista.add(obs);
    }

    @Override
    public void stergeObserver(Observer obs) {
        lista.remove(obs);
    }

    @Override
    public void trimiteNotificare() {
        for(Observer i : lista){
            i.primesteNotificare();
        }
    }
}
