package models;

public class Buton {

    private String numeButon;
    private Usa usa;
    private boolean isLiber;
    private boolean isDeschidereFortata;

    public Buton(String numeButon, Usa usa, boolean isLiber, boolean isDeschidereFortata) {
        this.numeButon = numeButon;
        this.usa = usa;
        this.isLiber = isLiber;
        this.isDeschidereFortata = isDeschidereFortata;
    }

    public void apasareButon(){
        if(isLiber){
            System.out.println( usa + " este in modul liber!");
        }
        if(isDeschidereFortata){
            System.out.println( usa + " este in modul deschidere fortata!");
        }

    }


}
