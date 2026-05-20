package ro.ase.cts.clase;

public class ClientFarmacie {
    private String numeClient;
    private boolean areReteta;

    public ClientFarmacie(String numeClient, boolean areReteta) {
        this.numeClient = numeClient;
        this.areReteta = areReteta;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public boolean isAreReteta() {
        return areReteta;
    }
}
