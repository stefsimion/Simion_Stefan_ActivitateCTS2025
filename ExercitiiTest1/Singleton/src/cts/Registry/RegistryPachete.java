package cts.Registry;

import java.util.HashMap;
import java.util.Map;

public class RegistryPachete {

    private RegistryPachete() {}
    static Map<String,PachetTuristic> mapa = new HashMap<>();

    public static void register(String nume, PachetTuristic pachet){
        if(mapa.containsKey(nume)){
            System.out.println("Exista deja!");
        }else{
            mapa.put(nume,pachet);
        }
    }

    public static PachetTuristic getPachet(String nume){
        return mapa.get(nume);

    }
}
