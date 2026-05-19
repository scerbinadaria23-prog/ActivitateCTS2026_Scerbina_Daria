package ro.ase.cts.clase;

public class Masa {
    private int nrMasa;
    private boolean masaLibera;
    private boolean masaDebarasata;
    private boolean masaAreServeteleNoi;

    public Masa(int nrMasa, boolean masaLibera, boolean masaDebarasata, boolean masaAreServeteleNoi) {
        this.nrMasa = nrMasa;
        this.masaLibera = masaLibera;
        this.masaDebarasata = masaDebarasata;
        this.masaAreServeteleNoi = masaAreServeteleNoi;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public boolean isMasaLibera() {
        return masaLibera;
    }

    public boolean isMasaDebarasata() {
        return masaDebarasata;
    }

    public boolean isMasaAreServeteleNoi() {
        return masaAreServeteleNoi;
    }
}
