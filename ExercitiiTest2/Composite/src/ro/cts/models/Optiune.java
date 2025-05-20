package ro.cts.models;

public interface Optiune {

    void adaugaNod(Optiune optiune);
    void stergeNod(Optiune optiune);
    Optiune getNod(int index);
    void descriere();

}
