package ro.cts.main;

import ro.cts.models.Item;
import ro.cts.models.Optiune;
import ro.cts.models.Sectiuni;
import ro.cts.models.Subsectiuni;

public class Main {
    public static void main(String[] args) {
        Optiune sectiune1 = new Sectiuni("Bauturi");
        Optiune sectiune2 = new Sectiuni("Mancare");

        Optiune subsectiune1 = new Subsectiuni("Sucuri");
        Optiune subsectiune2 = new Subsectiuni("Cafea");
        Optiune subsectiune3 = new Subsectiuni("Ceai");

        Optiune subsectiune4 = new Subsectiuni("Pizza");
        Optiune subsectiune5 = new Subsectiuni("Paste");

        Optiune item1 = new Item("Fanta");
        Optiune item2 = new Item("Sprite");
        Optiune item3 = new Item("Black");
        Optiune item4 = new Item("Musetel");
        Optiune item5 = new Item("Fructe");
        Optiune item6 = new Item("Quattro");
        Optiune item7 = new Item("Carnivora");
        Optiune item8 = new Item("Bolognese");

        sectiune1.adaugaNod(subsectiune1);
        sectiune1.adaugaNod(subsectiune2);
        sectiune1.adaugaNod(subsectiune3);
        sectiune2.adaugaNod(subsectiune4);
        sectiune2.adaugaNod(subsectiune5);

        subsectiune1.adaugaNod(item1);
        subsectiune1.adaugaNod(item2);
        subsectiune2.adaugaNod(item3);
        subsectiune3.adaugaNod(item4);
        subsectiune3.adaugaNod(item5);
        subsectiune4.adaugaNod(item6);
        subsectiune4.adaugaNod(item7);
        subsectiune5.adaugaNod(item8);

        sectiune1.descriere();
        sectiune2.descriere();

    }
}