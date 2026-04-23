package ro.ase.cts.lazy;

public class MasinaVan extends AMasina{

    public MasinaVan(String nrImatriculare, int anFabricatie) {
        super(nrImatriculare, anFabricatie);
    }

    @Override
    public void descriere() {
        System.out.println("VAN: " + super.toString());

    }
}
