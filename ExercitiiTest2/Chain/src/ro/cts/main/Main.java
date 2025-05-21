package ro.cts.main;

import ro.cts.models.*;

public class Main {
    public static void main(String[] args) {

        ClientFidel c1 = new ClientFidel("Marius",null, null);
        Notificator email = new NotificatorEmail();
        Notificator telefon = new NotificatorSMS();
        Notificator manager = new NotificatorManager();

        email.setUrmatorulNotificator(telefon);
        telefon.setUrmatorulNotificator(manager);

        email.notifica(c1, "Avem o noua oferta!");
    }
}