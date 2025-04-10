package cts.prototype;

import java.util.ArrayList;
import java.util.List;

public class ListaRezervari implements IListaRezervari{

    private List<String> rezervari;

    public void setRezervari(List<String> rezervari) {
        this.rezervari = rezervari;
    }

    public ListaRezervari() {
        rezervari = new ArrayList<String>();
    }

    @Override
    public IListaRezervari cloneaza() {
        ListaRezervari listaRezervari = new ListaRezervari();
        List<String> aux = new ArrayList<String>();
        for(String rezervare: this.rezervari){
            aux.add(rezervare);
        }
        listaRezervari.setRezervari(aux);

        return listaRezervari;
    }
}
