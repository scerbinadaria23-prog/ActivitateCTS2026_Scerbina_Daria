package ro.ase.cts.lazy;

public abstract class AMasina {
    protected String nrInmatriculare;
    protected int anFabricatie;

    protected AMasina(String nrImatriculare, int anFabricatie) {
        this.nrInmatriculare = nrImatriculare;
        this.anFabricatie = anFabricatie;
    }

    public abstract void descriere();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("nrImatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        return sb.toString();
    }
}
