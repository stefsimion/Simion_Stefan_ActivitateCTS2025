package models;

public class Adapter extends AbonamentMetrou{

    private AbonamentTerestru abonamentTerestru;

    public Adapter(String nume, int data, boolean hasAcord) {
        super(nume, data, hasAcord);
    }

    public Adapter(AbonamentTerestru abonamentTerestru){
        super(abonamentTerestru.getNume(), abonamentTerestru.getData(), true);
        this.abonamentTerestru = abonamentTerestru;
    }

    public void printBiletMetrou(){
        abonamentTerestru.printBiletTerestru();
    }

}
