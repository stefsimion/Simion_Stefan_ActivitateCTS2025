package cts.fabrici;

import cts.clase.PachetTuristic;
import cts.clase.TransportAutobuz;
import cts.clase.TransportTren;

public class TransportFactory implements PachetTuristicFactory{
    @Override
    public PachetTuristic crearePachet(TipPachet tip) {
        switch ((TipTransport) tip) {
            case TransportAutobuz: return new TransportAutobuz();
            case TransportTren: return new TransportTren();
            default: return null;
        }
    }
}
