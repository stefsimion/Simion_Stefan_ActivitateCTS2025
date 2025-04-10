package cts.ThreadSafe;

public class AgentieThreadSafe {
    private String numeAgentie;
    private float capital;
    private int nrAngajati;

    private static AgentieThreadSafe instanta = null;

    private AgentieThreadSafe(String numeAgentie, float capital, int nrAngajati) {
        this.numeAgentie = numeAgentie;
        this.capital = capital;
        this.nrAngajati = nrAngajati;
    }

    public static synchronized AgentieThreadSafe getInstanta(String numeAgentie, float capital, int nrAngajati){
        if( instanta == null) {
            instanta = new AgentieThreadSafe(numeAgentie,capital,nrAngajati);
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
