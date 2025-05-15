package ro.cts.Template.module;

public class Tramvai extends TramvaiAbs{
    private int nrLinie;

    public Tramvai(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    @Override
    protected void opresteStatie1() {
        System.out.println("Tramvaiul " + nrLinie + " opreste in statia Marriott");
    }

    @Override
    protected void opresteStatie2() {
        System.out.println("Tramvaiul " + nrLinie + " opreste in statia Parcul Drumul Taberei ");
    }

    @Override
    protected void opresteStatie3() {
        System.out.println("Tramvaiul " + nrLinie + " opreste in statia Romana");
    }

    @Override
    protected void opresteStatie4() {
        System.out.println("Tramvaiul " + nrLinie + " opreste in statia Manastirea Casin");
    }

    @Override
    protected void opresteStatie5() {
        System.out.println("Tramvaiul " + nrLinie + " opreste in statia Unirii");
    }
}