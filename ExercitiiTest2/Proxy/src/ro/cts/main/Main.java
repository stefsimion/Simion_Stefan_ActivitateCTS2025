package ro.cts.main;

import ro.cts.models.Client;
import ro.cts.models.ProxyRezervare;
import ro.cts.models.Rezervare;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Client> lista = new ArrayList<>();
        Client client1 = new Client("Andrei",18);
        Client client2 = new Client("MArio",18);
        Client client3 = new Client("Andreea",18);
        Client client4 = new Client("Marius",18);
        lista.add(client1);
        lista.add(client2);
        lista.add(client3);
        //lista.add(client4);

        Rezervare rezervare1 = new Rezervare(lista);
        rezervare1.rezerva();

        ProxyRezervare rezervare2 = new ProxyRezervare(rezervare1);
        rezervare2.rezerva();

    }
}