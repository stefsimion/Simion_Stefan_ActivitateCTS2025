package ro.cts.main;

import ro.cts.models.OcupareMasa;
import ro.cts.models.Template;

public class Main {
    public static void main(String[] args) {
        Template template = new OcupareMasa(13);

        template.ocupareMasa();
    }
}