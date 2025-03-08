package ro.cts.model.platforma;

import ro.cts.model.personal.Angajat;
import ro.cts.model.personal.Aplicant;
import ro.cts.model.reader.AngajatiReader;
import ro.cts.model.reader.BaseReader;

import java.io.FileNotFoundException;
import java.util.List;


public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		BaseReader baseReader = new AngajatiReader("angajati.txt");

		try {
			listaAplicanti = baseReader.readAplicanti();
			for(Aplicant angajat:listaAplicanti)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
