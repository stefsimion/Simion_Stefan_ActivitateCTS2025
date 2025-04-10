package cts.Lazy;

public class AgentieLazy {
    private String numeAgentie;
    private float capital;
    private int nrAngajati;

    private static AgentieLazy instanta = null;

    private AgentieLazy(String numeAgentie, float capital, int nrAngajati) {
        this.numeAgentie = numeAgentie;
        this.capital = capital;
        this.nrAngajati = nrAngajati;
    }

    public static AgentieLazy getInstanta(String numeAgentie, float capital, int nrAngajati){
        if( instanta == null) {
            instanta = new AgentieLazy(numeAgentie,capital,nrAngajati);
        }
        return instanta;
    }

    public String getNumeAgentie() {
        return numeAgentie;
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
    }

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }
}
