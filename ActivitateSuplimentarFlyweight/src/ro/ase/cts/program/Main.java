package ro.ase.cts.program;

import ro.ase.cts.clase.AbstractRezervare;
import ro.ase.cts.clase.FabricaRezervari;
import ro.ase.cts.clase.InformatiiRezervare;

public class Main {
    public static void main(String[] args) {
        FabricaRezervari fabricaRezervari = new FabricaRezervari();
        AbstractRezervare client1 = fabricaRezervari.getRezervareClient(
                "Maria Popescu",
                "0712345678",
                "maria@gmail.com"
        );

        AbstractRezervare client2 = fabricaRezervari.getRezervareClient(
                "Marcel Popescu",
                "0712349808",
                "marcel@gmail.com"
        );

        AbstractRezervare client1RezervareNoua = fabricaRezervari.getRezervareClient(
                "Maria Popescu",
                "0712345678",
                "maria@gmail.com"
        );

        client1.afiseazaRezervare(new InformatiiRezervare(5, 2, "18:00"));
        client2.afiseazaRezervare(new InformatiiRezervare(7, 4, "19:30"));
        client1RezervareNoua.afiseazaRezervare(new InformatiiRezervare(10, 3, "21:00"));

        System.out.println("Numar clienti creati in memorie: " + fabricaRezervari.getNumarClienti());
    }
}