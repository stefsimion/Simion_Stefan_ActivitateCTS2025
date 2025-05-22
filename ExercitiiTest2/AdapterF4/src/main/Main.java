package main;

import models.AbonamentMetrou;
import models.AbonamentTerestru;
import models.Adapter;

public class Main {
    public static void printAbonament(AbonamentMetrou t){
        t.printBiletMetrou();
    }
    public static void main(String[] args) {

        AbonamentTerestru t1 = new AbonamentTerestru("Marius", 10);
        AbonamentMetrou t2 = new AbonamentMetrou("George", 12, true);

        printAbonament(t2);
        Adapter t3 = new Adapter(t1);
        printAbonament(t3);
    }
}