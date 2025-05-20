package ro.cts.models;

public class BiletDecorator extends Decorator{

    public BiletDecorator(Bilet bilet) {
        super(bilet);
    }

    @Override
    public void aplicaDiscount(int procent) {
        super.bilet.setPret(bilet.getPret()*(100-procent)/100);
    }
}
