package main;

import models.Autobuz;
import models.IAutobuz;
import models.ProxyAutobuz;

public class Main {
    public static void main(String[] args) {

        IAutobuz a1 = new Autobuz(10, 0);
        IAutobuz a2 = new ProxyAutobuz((Autobuz) a1);
        a2.oprire();

    }
}