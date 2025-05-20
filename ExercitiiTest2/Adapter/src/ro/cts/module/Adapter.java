package ro.cts.module;

public class Adapter extends SoftBucatarie{

    private SoftBar softBar;

    public Adapter(String numeProdus, float pret, int cantitate, int stoc) {
        super(numeProdus, pret, cantitate, stoc);
    }

    public Adapter( SoftBar softBar) {
        super(softBar.getNumeProdus(), softBar.getPret(), softBar.getCantitate(), 10);
        this.softBar = softBar;
    }

    public void printeazaFactura() {
        softBar.aduNota();
    }
}
