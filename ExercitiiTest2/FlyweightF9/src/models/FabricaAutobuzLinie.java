package models;

import java.util.HashMap;

public class FabricaAutobuzLinie {

    private HashMap<Integer, IAutobuzLinie> mapa;

    public FabricaAutobuzLinie(HashMap<Integer, IAutobuzLinie> mapa) {
        this.mapa = mapa;
    }

    public IAutobuzLinie getAutobuzLinie(int nrLinie){
        IAutobuzLinie a = mapa.get(nrLinie);
        if(a == null){
            a = new AutobuzLinie("Mic", 2009, 12);
            mapa.put(nrLinie, a);
        }
        return a;
    }


}
