package cts.main;

import cts.BuilderV2.PachetTransport;
import cts.BuilderV2.PachetTransportBuilder;

public class MainV2 {
    public static void main(String[] args) {
        PachetTransport p1 = new PachetTransportBuilder().setHasWiFi(true).build();
        System.out.println(p1.toString());

        PachetTransport p2 = new PachetTransportBuilder().setHasWiFi(false).build();
        System.out.println(p2.toString());
    }
}
