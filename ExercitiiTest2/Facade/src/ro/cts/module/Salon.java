package ro.cts.module;

import java.util.List;

public class Salon {

    List<Boolean> paturi;

    public Salon(List<Boolean> paturi) {
        this.paturi = paturi;
    }

    public List<Boolean> getPaturi() {
        return paturi;
    }

    public void setPaturi(List<Boolean> paturi) {
        this.paturi = paturi;
    }

    public boolean disponibilitatePat(int pat) {
        return paturi.get(pat);
    }
}
