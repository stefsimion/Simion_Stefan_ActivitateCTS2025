package models;

public class Facade {
    Usa u1 = new Usa(1);
    Usa u2 = new Usa(2);
    Usa u3 = new Usa(3);
    public void modButonLiber(String nume){
        Buton b1 = new Buton(nume, u1, true, false);
        Buton b2 = new Buton(nume, u2, true, false);
        Buton b3 = new Buton(nume, u3, true, false);
        b1.apasareButon();
        b2.apasareButon();
        b3.apasareButon();
    }
    public void modButonDeschidereFortata(String nume){
        Buton b1 = new Buton(nume, u1, false, true);
        Buton b2 = new Buton(nume, u2, false, true);
        Buton b3 = new Buton(nume, u3, false, true);
        b1.apasareButon();
        b2.apasareButon();
        b3.apasareButon();
    }
}
