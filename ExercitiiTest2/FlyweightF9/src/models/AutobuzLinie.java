package models;

public class AutobuzLinie implements IAutobuzLinie {
    private String model;
    private int an;
    private int nrLinie;

    public AutobuzLinie(String model, int an, int nrLinie) {
        this.model = model;
        this.an = an;
        this.nrLinie = nrLinie;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public int getNrLinie() {
        return nrLinie;
    }

    public void setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    @Override
    public void descrieLinie() {
        System.out.println("Autobuzul de tip-ul " + model +" merge pe linia " + nrLinie);
    }
}
