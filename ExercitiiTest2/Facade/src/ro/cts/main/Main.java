package ro.cts.main;

import ro.cts.module.Facade;

public class Main {
    public static void main(String[] args) {
        Facade fatada = new Facade();
        fatada.verificareInternare("Marius", 18, 3, 0);
        fatada.verificareInternare("George", 21, 1 ,2);

    }
}