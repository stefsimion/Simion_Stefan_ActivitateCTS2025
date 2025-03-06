package ro.cts.model.personal;

public class Asistent extends Persoana implements IPredabil{

    private int id;
    private float ani;

    public Asistent(String nume, int varsta, int id, float ani) {
        super(nume, varsta);
        this.id = id;
        this.ani = ani;
    }

    public float getAni() {
        return ani;
    }

    public void setAni(float ani) {
        this.ani = ani;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void preda() {
        StringBuilder sb = new StringBuilder("Asistentul ");
        sb.append(super.nume);
        sb.append(" preda de obicei la seminar!");
        System.out.println(sb);
    }

    @Override
    public void afiseazaMetodaInvatare() {
        StringBuilder sb = new StringBuilder("Asistentul invata de ");
        sb.append(this.ani);
        sb.append(" ani!");
        System.out.println(sb);
    }


}
