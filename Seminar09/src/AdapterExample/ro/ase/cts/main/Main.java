package AdapterExample.ro.ase.cts.main;


import AdapterExample.ro.ase.cts.spital.Medicament;
import AdapterExample.ro.ase.cts.spital.MedicamentAdaptor;

public class Main {
    private static void procuraMedicament(AdapterExample.ro.ase.cts.farmacie.Medicament medicament){
        medicament.cumparaMedicament();
    }

    public static void main(String[] args) {
        Medicament medicamentSpital = new Medicament("Nurofen", 10);
        AdapterExample.ro.ase.cts.farmacie.Medicament medicamentFarmacie = new AdapterExample.ro.ase.cts.farmacie.Medicament("Algocalmin");
        medicamentSpital.achizitioneazaMedicament();
        medicamentFarmacie.cumparaMedicament();
        procuraMedicament(medicamentFarmacie);
        //procuraMedicament(medicamentSpital);

        MedicamentAdaptor medicamentAdaptor = new MedicamentAdaptor(medicamentSpital);
        procuraMedicament(medicamentAdaptor);
    }
}