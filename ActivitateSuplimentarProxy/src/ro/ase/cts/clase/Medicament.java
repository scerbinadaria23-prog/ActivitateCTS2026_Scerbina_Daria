package ro.ase.cts.clase;

public class Medicament implements AbstractMedicament{
    private String denumireMedicament;

    public Medicament(String denumireMedicament) {
        this.denumireMedicament = denumireMedicament;
    }

    @Override
    public void cumparaMedicament(ClientFarmacie clientFarmacie) {
        System.out.println("Client: " + clientFarmacie.getNumeClient()
            + " a cumparat medicamentul " + this.denumireMedicament + "." );
    }
}
