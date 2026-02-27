package ro.ase.cts.main;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.loader.AngajatiLoader;
import ro.ase.cts.loader.AplicantiLoader;

import java.io.FileNotFoundException;
import java.util.List;


public class Seminar2 {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		AplicantiLoader loader = new AngajatiLoader();
		try {
			listaAngajati = loader.load("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
