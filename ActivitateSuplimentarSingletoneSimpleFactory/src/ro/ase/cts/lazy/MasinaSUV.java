package ro.ase.cts.lazy;

public class MasinaSUV extends AMasina{

    public MasinaSUV(String nrImatriculare, int anFabricatie) {
        super(nrImatriculare, anFabricatie);
    }

    @Override
    public void descriere() {
        System.out.println("SUV: " + super.toString());
    }
}
