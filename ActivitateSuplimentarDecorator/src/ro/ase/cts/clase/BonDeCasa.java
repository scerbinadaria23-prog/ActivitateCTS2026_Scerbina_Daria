package ro.ase.cts.clase;

public class BonDeCasa implements AbstractBonDeCasa{
    private int nrBon;
    private double suma;

    public BonDeCasa(int nrBon, double suma) {
        this.nrBon = nrBon;
        this.suma = suma;
    }

    @Override
    public void printeazaBon() {
        System.out.println("Se printeza bonul de casa cu numarul " + this.nrBon + " si suma: " + this.suma);

    }
}
