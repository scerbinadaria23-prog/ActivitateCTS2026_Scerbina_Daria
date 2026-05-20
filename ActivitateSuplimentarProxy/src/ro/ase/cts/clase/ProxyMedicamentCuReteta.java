package ro.ase.cts.clase;

public class ProxyMedicamentCuReteta implements AbstractMedicament{
    private AbstractMedicament medicament;

    public ProxyMedicamentCuReteta(AbstractMedicament medicament){
        this.medicament = medicament;
    }

    @Override
    public void cumparaMedicament(ClientFarmacie clientFarmacie) {
        if (clientFarmacie.isAreReteta()){
            medicament.cumparaMedicament(clientFarmacie);
        }else{
            System.out.println("Clientul " + clientFarmacie.getNumeClient()
                    + " nu poate cumpara medicamentul deoarece nu are reteta.");
        }
    }
}
