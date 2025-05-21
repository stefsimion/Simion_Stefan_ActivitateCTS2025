package ro.cts.models;

public class Cash implements ModPlata{
    @Override
    public void plateste(String nume, double suma) {
        System.out.println("Plata este cash in valoare de " + suma);
    }
}
