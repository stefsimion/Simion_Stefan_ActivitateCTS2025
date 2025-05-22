package models;

import java.util.ArrayList;
import java.util.List;

public class Tip implements Composite{

    private String nume;
    private List<Composite> lista;

    public Tip(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<>();
    }

    @Override
    public void addNod(Composite composite) {
        lista.add(composite);
    }

    @Override
    public void stergeNod(Composite composite) {
        lista.remove(composite);
    }

    @Override
    public void descriere() {
        System.out.println(nume + ":");
        for(Composite c:lista){
            c.descriere();
        }
    }
}
