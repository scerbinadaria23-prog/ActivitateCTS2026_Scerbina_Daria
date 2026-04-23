package ro.ase.cts.clase;

public class Ceai extends ABautura{
    public Ceai(String nume, int volum, double pret) {
        super(nume, volum, pret);
    }

    @Override
    public void preparare() {
        System.out.println("Se prepara ceaiul.");

    }
}
