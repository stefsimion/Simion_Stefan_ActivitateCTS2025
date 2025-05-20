package ro.cts.module;

public class Pacient {

    private String nume;
    private int varsta;
    private int isBolnav;

    public Pacient(String nume, int varsta, int isBolnav) {
        this.nume = nume;
        this.varsta = varsta;
        this.isBolnav = isBolnav;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getIsBolnav() {
        return isBolnav;
    }

    public void setIsBolnav(int isBolnav) {
        this.isBolnav = isBolnav;
    }

    public void verificaGravitate() {
        if(isBolnav == 1) {
            System.out.println("E sanatos");
        }
        if(isBolnav == 2) {
            System.out.println("E mediu");
        }
        if(isBolnav == 3) {
            System.out.println("E grav");
        }
    }
}
