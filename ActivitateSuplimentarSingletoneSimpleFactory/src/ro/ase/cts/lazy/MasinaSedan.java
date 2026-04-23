package ro.ase.cts.lazy;

public class MasinaSedan extends AMasina{
    public MasinaSedan(String nrImatriculare, int anFabricatie) {
        super(nrImatriculare, anFabricatie);
    }

    @Override
    public void descriere() {
        System.out.println("SEDAN: " + super.toString());
    }
}
