package ro.cts.module;

public class Medic {

    private String nume;
    private boolean confirmareInternare;

    public Medic(String nume, boolean confirmareInternare) {
        this.nume = nume;
        this.confirmareInternare = confirmareInternare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isConfirmareInternare() {
        return confirmareInternare;
    }

    public void setConfirmareInternare(boolean confirmareInternare) {
        this.confirmareInternare = confirmareInternare;
    }


}
