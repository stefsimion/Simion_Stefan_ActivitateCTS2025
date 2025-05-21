package ro.cts.models;

public class Card implements ModPlata{
    @Override
    public void plateste(String nume, double suma) {
        System.out.println("Plata este cu cardul in valoare de " + suma);
    }
}
