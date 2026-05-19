package ro.ase.cts.clase;

public class AdapterPlatformaExterna implements AbstractComandaRestaurant {
    private PlatformaExterna platformaExterna;

    public AdapterPlatformaExterna(PlatformaExterna platformaExterna) {
        this.platformaExterna = platformaExterna;
    }

    @Override
    public String obtineNumeClient() {
        return platformaExterna.getClient();
    }

    @Override
    public String obtineProdusComandat() {
        return platformaExterna.getDenumireProdus();
    }

    @Override
    public String obtineAdresaLivrare() {
        return platformaExterna.getAdresaComenzii();
    }
}
