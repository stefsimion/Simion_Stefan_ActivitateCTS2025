package ro.cts.models;

public class NotificatorSMS extends Notificator{

    @Override
    public void notifica(ClientFidel client, String mesaj) {
        if(client.getTelefon() != null){
            System.out.println(client.getNume() + " ai primit un sms " + mesaj);
        }
        else {
            super.getUrmatorulNotificator().notifica(client,mesaj);
        }
    }
}
