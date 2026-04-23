package AdapterExample.ro.ase.cts.spital;

import AdapterExample.ro.ase.cts.farmacie.Medicament;

public class MedicamentAdaptor extends Medicament {

    private AdapterExample.ro.ase.cts.spital.Medicament medicamentSpital;

    public MedicamentAdaptor(AdapterExample.ro.ase.cts.spital.Medicament medicamentSpital) {
        super(medicamentSpital.getNumeMedicament());
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
