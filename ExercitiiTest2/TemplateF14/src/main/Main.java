package main;

import models.SensInvers;
import models.SensNormal;
import models.Template;

public class Main {
    public static void main(String[] args) {
        Template t1 = new SensInvers();
        Template t2 = new SensNormal();

        t1.parcurgere();
        t2.parcurgere();
    }
}