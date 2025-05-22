package models;

public class Troleibuz extends Transport {

    @Override
    public void recomandare(int distanta) {
        if(distanta < 5) {
            System.out.println("Troleu bro");
        }
        else {
            super.getUrmatorulTransport().recomandare(distanta);
        }
    }
}
