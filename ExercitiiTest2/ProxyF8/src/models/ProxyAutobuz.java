package models;

public class ProxyAutobuz implements IAutobuz{

    private Autobuz autobuz;

    public ProxyAutobuz(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    public IAutobuz getAutobuz() {
        return autobuz;
    }

    public void setAutobuz(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void oprire() {
        if(autobuz.getNrOameni() == 0){
            System.out.println("Auotbuzul se intoarce la hala!");
        }
        else
        {
            autobuz.oprire();
        }
    }
}
