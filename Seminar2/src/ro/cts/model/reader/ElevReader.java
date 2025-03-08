package ro.cts.model.reader;

import ro.cts.model.personal.Angajat;
import ro.cts.model.personal.Aplicant;
import ro.cts.model.personal.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends BaseReader {

    public ElevReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(super.getFileName()));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (input2.hasNext()) {
            Elev elev = new Elev();
            citireAplicant(elev, input2);
            int clasa = input2.nextInt();
            String tutore = input2.next();
            elev.setTutore(tutore);
            elev.setClasa(clasa);
            elevi.add(elev);
        }

        input2.close();
        return elevi;
    }
}
