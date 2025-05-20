package ro.cts.module;

import java.util.ArrayList;
import java.util.List;

public class Facade {

    public void verificareInternare(String numeClient, int varsta, int stare, int pat){

        List<Boolean> paturi = new ArrayList<>();
        paturi.add(true);
        paturi.add(false);
        paturi.add(false);
        paturi.add(true);

        Medic medic = new Medic("Andrei", false);
        Pacient pacient1 = new Pacient(numeClient, varsta, stare);
        Salon salon = new Salon(paturi);
        pacient1.verificaGravitate();

        if (pacient1.getIsBolnav() == 3) {
            medic.setConfirmareInternare(true);
            System.out.println(numeClient + " trebuie sa fie internat");
            if(salon.disponibilitatePat(pat)){
                System.out.println("Am gasit loc in patul " + pat );
            }
            else {
                System.out.println("Patul selectat nu e liber va rugam alegeti alt pat");
            }
        }
        else
        {
            System.out.println(numeClient + " nu trebuie sa fie internat");
        }

    }

}
