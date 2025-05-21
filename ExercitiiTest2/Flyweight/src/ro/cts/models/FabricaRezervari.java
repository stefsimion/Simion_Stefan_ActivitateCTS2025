package ro.cts.models;

import java.util.HashMap;

public class FabricaRezervari {

    private HashMap<Integer, IRezervare> mapa;

    public FabricaRezervari() {
        this.mapa = new HashMap<Integer, IRezervare>();
    }

    public Integer getNrRezervari() {
        return mapa.size();
    }

    public IRezervare getRezervare(int nrMasa){
            IRezervare rezervare = mapa.get(nrMasa);
            if(rezervare == null){
                rezervare = new Rezervare(nrMasa, 2, 17);
                mapa.put(nrMasa, rezervare);
            }
            return rezervare;
    }

}
