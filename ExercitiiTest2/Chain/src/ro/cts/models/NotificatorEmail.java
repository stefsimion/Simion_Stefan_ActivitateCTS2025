package ro.cts.models;

public class NotificatorEmail extends Notificator{
    @Override
    public void notifica(ClientFidel client, String mesaj) {
            if(client.getEmail() != null){
                System.out.println(client.getNume() + " ai primit un email " + mesaj);
            }
            else {
                super.getUrmatorulNotificator().notifica(client,mesaj);
            }
    }
}
