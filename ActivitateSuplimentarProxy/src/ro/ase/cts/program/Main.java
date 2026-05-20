package ro.ase.cts.program;

import ro.ase.cts.clase.AbstractMedicament;
import ro.ase.cts.clase.ClientFarmacie;
import ro.ase.cts.clase.Medicament;
import ro.ase.cts.clase.ProxyMedicamentCuReteta;

public class Main {
    public static void main(String[] args) {
        ClientFarmacie client1 = new ClientFarmacie("Maria", true);
        ClientFarmacie client2 = new ClientFarmacie("Ion", false);

        AbstractMedicament medicament = new Medicament("Antibiotic");

        AbstractMedicament proxyMedicament = new ProxyMedicamentCuReteta(medicament);

        System.out.println("Client cu reteta:");
        proxyMedicament.cumparaMedicament(client1);

        System.out.println();

        System.out.println("Client fara reteta:");
        proxyMedicament.cumparaMedicament(client2);
    }
}