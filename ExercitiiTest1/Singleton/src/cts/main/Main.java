package cts.main;

import cts.Eager.AgentieEager;
import cts.Lazy.AgentieLazy;
import cts.Registry.Cazare;
import cts.Registry.RegistryPachete;
import cts.Registry.Transport;
import cts.ThreadSafe.AgentieThreadSafe;

public class Main {
    public static void main(String[] args) {
        Cazare cazare=new Cazare();
        Cazare cazare2=new Cazare();
        Transport transport=new Transport();

        RegistryPachete.register("Cazare", cazare);
        RegistryPachete.register("Transport", transport);
        RegistryPachete.getPachet("Cazare").descriere();
        RegistryPachete.getPachet("Transport").descriere();

        AgentieThreadSafe primaAgentie=AgentieThreadSafe.getInstanta("AgeTur", 1000, 10);
        AgentieThreadSafe aDouaAgentie=AgentieThreadSafe.getInstanta("O alta agentie", 10, 2);

        //System.out.println(primaAgentie.getNumeAgentie());
        //System.out.println(aDouaAgentie.getNumeAgentie());

        AgentieEager primaAgentieE=AgentieEager.getInstanta("AgeTur", 1000, 10);
        AgentieEager aDouaAgentieE=AgentieEager.getInstanta("O alta agentie", 10, 2);

        //System.out.println(primaAgentieE.getNumeAgentie());
        //System.out.println(aDouaAgentieE.getNumeAgentie());

        AgentieLazy primaAgentieL=AgentieLazy.getInstanta("AgeTur", 1000, 10);
        AgentieLazy aDouaAgentieL=AgentieLazy.getInstanta("O alta agentie", 10, 2);

        //System.out.println(primaAgentieL.getNumeAgentie());
        //System.out.println(aDouaAgentieL.getNumeAgentie());


    }
}