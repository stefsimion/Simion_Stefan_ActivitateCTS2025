package main;

import models.Autobuz;
import models.Metrou;
import models.Transport;
import models.Troleibuz;

public class Main {
    public static void main(String[] args) {

        Transport t1 = new Troleibuz();
        Transport t2 = new Autobuz();
        Transport t3 = new Metrou();

        t3.setUrmatorulTransport(t1);
        t1.setUrmatorulTransport(t2);

        t3.recomandare(2);
        t3.recomandare(6);
        t3.recomandare(4);

    }
}