package ro.cts.models;

import java.util.ArrayList;
import java.util.List;

public class Subsectiuni  implements Optiune{

    private String nume;
    private List<Optiune> listaItems;

    public Subsectiuni(String nume) {
        this.nume = nume;
        this.listaItems = new ArrayList<Optiune>();
    }

    @Override
    public void adaugaNod(Optiune optiune) {
        listaItems.add(optiune);
    }

    @Override
    public void stergeNod(Optiune optiune) {
        listaItems.remove(optiune);
    }

    @Override
    public Optiune getNod(int index) {
        return listaItems.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("  SubSectiunea: " + nume);
        for(Optiune optiune : listaItems){
            optiune.descriere();
        }
    }
}
