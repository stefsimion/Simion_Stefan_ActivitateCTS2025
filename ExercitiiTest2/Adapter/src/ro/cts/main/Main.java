package ro.cts.main;

import ro.cts.module.Adapter;
import ro.cts.module.SoftBar;
import ro.cts.module.SoftBucatarie;

public class Main {

    public static void cereNota(SoftBucatarie softBucatarie) {
        softBucatarie.printeazaFactura();
    }

    public static void main(String[] args) {
        SoftBucatarie soft1 = new SoftBucatarie("Pizza", 40 , 1, 50);
        cereNota(soft1);

        SoftBar soft2 = new SoftBar("Aperol", 20 , 1);
        Adapter adapterSoft = new Adapter(soft2);
        cereNota(adapterSoft);

    }
}