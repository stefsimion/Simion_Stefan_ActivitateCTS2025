package ro.cts.model.personal;

public class Student extends Persoana {

    private int id;
    private int an_studiu;

    public Student(String nume, int varsta, int id, int an_studiu) {
        super(nume, varsta);
        this.id = id;
        this.an_studiu = an_studiu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAn_studiu() {
        return an_studiu;
    }

    public void setAn_studiu(int an_studiu) {
        this.an_studiu = an_studiu;
    }

    @Override
    public void afiseazaMetodaInvatare() {

    }
}
