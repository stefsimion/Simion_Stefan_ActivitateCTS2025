package cts.SimpleFactory;

public class AgentieFactorySingleton {

    private static AgentieFactorySingleton instanta = null;

    private AgentieFactorySingleton(){

    }

    public static synchronized AgentieFactorySingleton getInstanta(){
        if(instanta == null) {
            instanta=new AgentieFactorySingleton();
        }
        return instanta;
    }

    public PachetTuristic crearePachet(TipPachet tip){
        switch (tip){
            case Cazare: {
                return new Cazare();
            }
            case Transport: {
                return new Transport();
            }
            default: return null;
        }
    }

}
