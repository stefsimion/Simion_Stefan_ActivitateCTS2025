package cts.main;

import cts.prototype.IListaRezervari;
import cts.prototype.ListaRezervari1;
import cts.prototype.ListaRezervari2;

public class Main {
    public static void main(String[] args) {

        IListaRezervari r1 = new ListaRezervari2(2, "Ana");
        IListaRezervari r2 = r1.cloneaza();
        System.out.println(r2.toString());

        IListaRezervari listaR=new ListaRezervari1();

        IListaRezervari copieLista = new ListaRezervari1();
        copieLista = listaR.cloneaza();

        System.out.println(copieLista.toString());

    }
}