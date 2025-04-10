package cts.prototype;

public class ListaRezervari2 implements IListaRezervari{

    private int ora;
    private String nume;

    @Override
    public IListaRezervari cloneaza() {
        ListaRezervari2 rezervare = new ListaRezervari2();
        rezervare.nume = this.nume;
        rezervare.ora = this.ora;
        return rezervare;
    }

    public ListaRezervari2() {
        this.ora= 1;
        this.nume= "Andrei";
    }

    public ListaRezervari2(int ora, String nume) {
        this.ora = ora;
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ListaRezervari2{");
        sb.append("ora=").append(ora);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
