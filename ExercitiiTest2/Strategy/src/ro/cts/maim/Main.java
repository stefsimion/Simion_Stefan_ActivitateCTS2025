package ro.cts.maim;


import ro.cts.models.Card;
import ro.cts.models.Cash;
import ro.cts.models.Client;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("Andrei");
        client1.setModPlata(new Card());
        client1.setModPlata(new Cash());

        client1.plateste(130);

    }
}