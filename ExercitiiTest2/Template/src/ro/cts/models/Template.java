package ro.cts.models;

public abstract class Template {

    private int nrMasa;

    public Template(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public abstract void curatareMasa(int nrMasa);
    public abstract void asezareServetele(int nrMasa);
    public abstract void asezareTacamuri(int nrMasa);
    public abstract void invitaPersoane(int nrMasa);

    public final void ocupareMasa(){
        curatareMasa(nrMasa);
        asezareServetele(nrMasa);
        asezareTacamuri(nrMasa);
        invitaPersoane(nrMasa);
    }

}
