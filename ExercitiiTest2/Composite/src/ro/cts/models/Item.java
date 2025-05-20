package ro.cts.models;

public class Item implements Optiune{

    private String nume;

    public Item(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaNod(Optiune optiune) {
        System.out.println("Nu este implementata");
    }

    @Override
    public void stergeNod(Optiune optiune) {
        System.out.println("Nu este implementata");
    }

    @Override
    public Optiune getNod(int index) {
        System.out.println("Nu este implementata");
        return null;
    }

    @Override
    public void descriere() {
        System.out.println("      Itemul -> " + nume);
    }
}
