package ro.cts.models;

import java.util.ArrayList;
import java.util.List;

public class Sectiuni implements Optiune{

    private String nume;
    private List<Optiune> listaSub;

    public Sectiuni(String nume) {
        this.nume = nume;
        this.listaSub = new ArrayList<Optiune>();
    }

    @Override
    public void adaugaNod(Optiune optiune) {
        listaSub.add(optiune);
    }

    @Override
    public void stergeNod(Optiune optiune) {
        listaSub.remove(optiune);
    }

    @Override
    public Optiune getNod(int index) {
        return listaSub.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Sectiunea " + nume);
        for(Optiune optiune : listaSub){
            optiune.descriere();
        }
    }
}
