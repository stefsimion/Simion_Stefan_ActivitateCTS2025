package models;

public class Bilet implements IBilet {

    private String numeClient;

    public Bilet(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void printareBilet() {
        System.out.println(numeClient + " are un bilet! ");
    }
}
