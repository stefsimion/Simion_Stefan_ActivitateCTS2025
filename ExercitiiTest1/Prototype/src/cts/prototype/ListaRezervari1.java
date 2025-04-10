package cts.prototype;

import java.util.ArrayList;
import java.util.List;

public class ListaRezervari1 implements IListaRezervari{

    private List<String> rezervari;

    public void setRezervari(List<String> rezervari) {
        this.rezervari = rezervari;
    }

    public ListaRezervari1() {
        rezervari = new ArrayList<String>();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ListaRezervari1{");
        sb.append("rezervari=").append(rezervari);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IListaRezervari cloneaza() {
        ListaRezervari1 listaRezervari = new ListaRezervari1();
        List<String> aux = new ArrayList<String>();
        for(String rezervare: this.rezervari){
            aux.add(rezervare);
        }
        listaRezervari.setRezervari(aux);

        return listaRezervari;
    }
}
