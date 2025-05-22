package models;

public class Card implements ModPlata {
    @Override
    public void plateste(Client c, double suma) {
        System.out.println("Plateste cu card suma de + " + suma);
    }
}
