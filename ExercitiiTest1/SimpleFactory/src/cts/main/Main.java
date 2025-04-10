package cts.main;

import cts.SimpleFactory.AgentieFactory;
import cts.SimpleFactory.PachetTuristic;
import cts.SimpleFactory.TipPachet;

public class Main {
    public static void main(String[] args) {
        AgentieFactory agentieFactory = new AgentieFactory();
        PachetTuristic pachetTuristic = null;
        try {
            pachetTuristic = agentieFactory.crearePachet(TipPachet.Cazare);
        } catch (Exception e) {
            e.printStackTrace();
        }

        pachetTuristic.descriere();
    }
}