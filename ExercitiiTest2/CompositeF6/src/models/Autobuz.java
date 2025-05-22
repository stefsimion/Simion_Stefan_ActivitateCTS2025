package models;

public class Autobuz implements Composite{

    private String nume;

    public Autobuz(String nume) {
        this.nume = nume;
    }

    @Override
    public void addNod(Composite composite) {
        System.out.println("Nu este implementata");
    }

    @Override
    public void stergeNod(Composite composite) {
        System.out.println("Nu este implementata");
    }

    @Override
    public void descriere() {
        System.out.println("   Autobuz -> " + nume);
    }
}
