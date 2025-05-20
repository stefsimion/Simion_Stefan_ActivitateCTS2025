package ro.cts.models;

public abstract class Decorator implements IBilet {

    protected Bilet bilet;

    public Decorator(Bilet bilet) {
        this.bilet = bilet;
    }

    public Bilet getBilet() {
        return bilet;
    }

    public void setBilet(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printeazaBilet() {
        bilet.printeazaBilet();
        System.out.println("La multi ani!");

    }

    public abstract void aplicaDiscount(int procent);


}
