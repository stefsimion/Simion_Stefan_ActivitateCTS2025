package ro.cts.models;

public class OcupareMasa extends Template{

    public OcupareMasa(int nrMasa) {
        super(nrMasa);
    }

    @Override
    public void curatareMasa(int nrMasa) {
        System.out.println("Masa cu nr " + nrMasa + " a fost curatata!");
    }

    @Override
    public void asezareServetele(int nrMasa) {
        System.out.println("Masa cu nr " + nrMasa + " are servetele!");

    }

    @Override
    public void asezareTacamuri(int nrMasa) {
        System.out.println("Masa cu nr " + nrMasa + " are tacamuri!");

    }

    @Override
    public void invitaPersoane(int nrMasa) {
        System.out.println("Persoanele s-au asezat la masa " + nrMasa);

    }
}
