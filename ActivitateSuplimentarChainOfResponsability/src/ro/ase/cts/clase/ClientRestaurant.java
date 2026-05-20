package ro.ase.cts.clase;

public class ClientRestaurant {
    private String numeClient;
    private String nrTelefon;
    private String adresaMail;

    public ClientRestaurant(String numeClient, String nrTelefon, String adresaMail) {
        this.numeClient = numeClient;
        this.nrTelefon = nrTelefon;
        this.adresaMail = adresaMail;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public String getAdresaMail() {
        return adresaMail;
    }
}
