package ro.ase.cts.clase;

public class RezervareClient implements AbstractRezervare{
    private String numeClient;
    private String nrTelefon;
    private String adresaMail;

    public RezervareClient(String numeClient, String nrTelefon, String adresaMail) {
        this.numeClient = numeClient;
        this.nrTelefon = nrTelefon;
        this.adresaMail = adresaMail;
    }

    @Override
    public void afiseazaRezervare(InformatiiRezervare informatiiRezervare) {
        System.out.println("Clientul: " + this.numeClient
                + ", telefon: " + this.nrTelefon
                + ", email: " + this.adresaMail
                + ", are rezervare la masa: " + informatiiRezervare.getNrMasa()
                + ", pentru " + informatiiRezervare.getNrPersoane()
                + " persoane, la ora " + informatiiRezervare.getOraRezervare());
    }
}
