package main;

import models.Bilet;
import models.Decorator;
import models.DecoratorBilet;
import models.IBilet;

public class Main {
    public static void main(String[] args) {

        IBilet b1 = new Bilet("Andrei");
        b1.printareBilet();
        Decorator b2 = new DecoratorBilet(b1);
        b2.printareBilet();
    }
}