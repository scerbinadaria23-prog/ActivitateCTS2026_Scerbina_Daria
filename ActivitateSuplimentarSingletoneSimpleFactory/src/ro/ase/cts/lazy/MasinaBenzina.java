package ro.ase.cts.lazy;

public class MasinaBenzina extends AMasina{
    private int capacitate;

    public MasinaBenzina(String nrInmatriculare, int anFabricatie, int capacitate) {
        super(nrInmatriculare, anFabricatie);
        this.capacitate = capacitate;
    }

    @Override
    public void descriere() {
        System.out.println("Masina benzina: " +
                nrInmatriculare + ", an: " +
                anFabricatie + ", capacitate: " + capacitate);
    }
}
