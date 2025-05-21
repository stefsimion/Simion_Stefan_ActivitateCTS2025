package ro.cts.models;

public abstract class Notificator {

    private Notificator urmatorulNotificator;

    public Notificator getUrmatorulNotificator() {
        return urmatorulNotificator;
    }

    public void setUrmatorulNotificator(Notificator urmatorulNotificator) {
        this.urmatorulNotificator = urmatorulNotificator;
    }

    public abstract void notifica(ClientFidel client , String mesaj);

}
