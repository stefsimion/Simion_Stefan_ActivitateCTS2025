package ro.cts.module;

public class SoftBucatarie {

    private String numeProdus;
    private float pret;
    private int cantitate;
    private int stoc;

    public SoftBucatarie(String numeProdus, float pret, int cantitate, int stoc) {
        this.numeProdus = numeProdus;
        this.pret = pret;
        this.cantitate = cantitate;
        this.stoc = stoc;
    }

    public String getNumeProdus() {
        return numeProdus;
    }

    public void setNumeProdus(String numeProdus) {
        this.numeProdus = numeProdus;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public int getStoc() {
        return stoc;
    }

    public void setStoc(int stoc) {
        this.stoc = stoc;
    }

    public void comandaProdus() {
        System.out.println("Ati comandat " + numeProdus + " in cantitate de " + cantitate);
    }

    public void printeazaFactura() {
        System.out.println("Produsul " + numeProdus + " cu valoarea " + pret*cantitate);
    }
}
