package main;

import models.Client;
import models.LinieAutobuz;
import models.Observer;
import models.Subject;

public class Main {
    public static void main(String[] args) {

        Observer o1 = new Client("Ana");
        Observer o2 = new Client("Andrei");

        Subject s1 = new LinieAutobuz(13);
        s1.addObserver(o1);
        s1.addObserver(o2);
        s1.trimiteNotificare();

    }
}