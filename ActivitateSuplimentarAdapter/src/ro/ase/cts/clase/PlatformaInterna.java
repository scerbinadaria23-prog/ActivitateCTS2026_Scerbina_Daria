package ro.ase.cts.clase;

public class PlatformaInterna implements AbstractComandaRestaurant{
    private String numeClient;
    private String produsComandat;
    private String adresaLivrare;

    public PlatformaInterna(String numeClient, String produsComandat, String adresaLivrare) {
        this.numeClient = numeClient;
        this.produsComandat = produsComandat;
        this.adresaLivrare = adresaLivrare;
    }

    @Override
    public String obtineNumeClient() {
        return this.numeClient;
    }

    @Override
    public String obtineProdusComandat() {
        return this.produsComandat;
    }

    @Override
    public String obtineAdresaLivrare() {
        return this.adresaLivrare;
    }
}
