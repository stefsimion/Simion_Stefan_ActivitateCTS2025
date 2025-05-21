package ro.cts.models;

public class NotificatorManager extends Notificator{

    @Override
    public void notifica(ClientFidel client, String mesaj) {
        System.out.println("Domnule manager clientul " + client.getNume() + " nu are email/telefon");
    }
}
