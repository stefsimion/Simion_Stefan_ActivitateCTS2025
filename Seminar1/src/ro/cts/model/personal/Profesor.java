package ro.cts.model.personal;

public class Profesor extends Persoana implements IPredabil{
    
    private int id;
    private float vechime;

    public Profesor(String nume, int varsta, int id, float vechime) {
        super(nume, varsta);
        this.id = id;
        this.vechime = vechime;
    }

    public float getVechime() {
        return vechime;
    }

    public void setVechime(float vechime) {
        this.vechime = vechime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void afiseazaMetodaInvatare() {
        StringBuilder sb = new StringBuilder("Profesorul invata de ");
        sb.append(this.vechime);
        sb.append(" ani!");
        System.out.println(sb);
    }

    @Override
    public void preda() {
        StringBuilder sb = new StringBuilder("Profesorul ");
        sb.append(super.nume);
        sb.append(" preda de obicei la curs!");
        System.out.println(sb);
    }
}
