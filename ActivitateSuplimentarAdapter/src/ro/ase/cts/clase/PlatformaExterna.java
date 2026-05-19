package ro.ase.cts.clase;

public class PlatformaExterna {
    private String client;
    private String denumireProdus;
    private String adresaComenzii;

    public PlatformaExterna(String client, String denumireProdus, String adresaComenzii) {
        this.client = client;
        this.denumireProdus = denumireProdus;
        this.adresaComenzii = adresaComenzii;
    }

    public String getClient() {
        return client;
    }

    public String getDenumireProdus() {
        return denumireProdus;
    }

    public String getAdresaComenzii() {
        return adresaComenzii;
    }
}
