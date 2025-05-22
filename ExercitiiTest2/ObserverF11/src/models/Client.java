package models;

public class Client implements Observer{

    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare() {
        System.out.println(nume + " ai primit o notificare, autobuzul a plecat din capat.");
    }
}
