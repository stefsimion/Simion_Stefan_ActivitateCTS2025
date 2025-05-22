package models;

public abstract class Transport {

    private Transport urmatorulTransport;

    public Transport() {

    }

    public Transport getUrmatorulTransport() {
        return urmatorulTransport;
    }

    public void setUrmatorulTransport(Transport urmatorulTransport) {
        this.urmatorulTransport = urmatorulTransport;
    }

    public abstract void recomandare(int distanta);
}
