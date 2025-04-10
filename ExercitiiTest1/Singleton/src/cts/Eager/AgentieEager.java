package cts.Eager;

public class AgentieEager {
    private String numeAgentie;
    private float capital;
    private int nrAngajati;

    private static final AgentieEager instanta = new AgentieEager();

    private AgentieEager() {
        this.numeAgentie = "Comodo";
        this.capital = 3000;
        this.nrAngajati = 4;
    }

    public static AgentieEager getInstanta(String numeAgentie, float capital, int nrAngajati){
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
