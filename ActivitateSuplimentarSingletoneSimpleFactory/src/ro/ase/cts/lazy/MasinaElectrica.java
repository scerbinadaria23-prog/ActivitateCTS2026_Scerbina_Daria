package ro.ase.cts.lazy;

public class MasinaElectrica extends AMasina{
    private int autonomie;

    public MasinaElectrica(String nrInmatriculare, int anFabricatie, int autonomie) {
        super(nrInmatriculare, anFabricatie);
        this.autonomie = autonomie;
    }

    @Override
    public void descriere() {
        System.out.println("Masina electrica: " +
                nrInmatriculare + ", an: " +
                anFabricatie + ", autonomie: " + autonomie);
    }
}
