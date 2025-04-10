package cts.SimpleFactory;

public class AgentieFactory {

    public PachetTuristic crearePachet(TipPachet tip){
        switch (tip) {
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
