package models;

public class Metrou extends Transport{

    @Override
    public void recomandare(int distanta) {
        if(distanta < 3) {
            System.out.println("metroul");
        }
        else {
            super.getUrmatorulTransport().recomandare(distanta);
        }
    }
}
