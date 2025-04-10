package cts.fabrici;

import cts.clase.CazareCabana;
import cts.clase.CazareHotel;
import cts.clase.PachetTuristic;

public class CazareFactory implements PachetTuristicFactory{
    @Override
    public PachetTuristic crearePachet(TipPachet tip) {
        switch ((TipCazare) tip) {
            case CazareCabana: return new CazareCabana();
            case CazareHotel: return new CazareHotel();
            default: return null;
        }
    }
}
