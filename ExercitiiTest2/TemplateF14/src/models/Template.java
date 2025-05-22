package models;

public abstract class Template {

    protected boolean isInvers;

    public Template(boolean isInvers) {
        this.isInvers = isInvers;
    }

    protected abstract void statia1();
    protected abstract void statia2();
    protected abstract void statia3();
    protected abstract void statia4();
    protected abstract void statia5();

    public final void parcurgere(){
        if(isInvers)
        {
            statia5();
            statia4();
            statia3();
            statia2();
            statia1();
        }
        if(!isInvers){
            statia1();
            statia2();
            statia3();
            statia4();
            statia5();
        }
    }



}
