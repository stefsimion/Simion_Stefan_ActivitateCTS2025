package models;

public abstract class Decorator implements IBilet{

    private IBilet bilet;

    public Decorator(IBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printareBilet(){
        bilet.printareBilet();
        System.out.println("La multi ani!");
    }


}
