package models;

public class Cash implements ModPlata{
    @Override
    public void plateste(Client c, double suma) {
        System.out.println("Plateste cu cash suma de + " + suma);
    }
}
