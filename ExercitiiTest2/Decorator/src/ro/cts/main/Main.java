package ro.cts.main;

import ro.cts.models.Bilet;
import ro.cts.models.BiletDecorator;
import ro.cts.models.Decorator;

public class Main {
    public static void main(String[] args) {

        Bilet bilet1 = new Bilet(10, "Andrei" , 100);
        bilet1.printeazaBilet();

        Decorator biletDecorat = new BiletDecorator(bilet1);
        biletDecorat.aplicaDiscount(10);
        biletDecorat.printeazaBilet();

    }
}