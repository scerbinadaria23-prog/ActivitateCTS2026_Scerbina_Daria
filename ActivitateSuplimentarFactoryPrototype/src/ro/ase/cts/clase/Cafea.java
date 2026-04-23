package ro.ase.cts.clase;

public class Cafea extends ABautura {
    public Cafea(String nume, int volum, double pret) {
        super(nume, volum, pret);
    }

    @Override
    public void preparare() {
        System.out.println("Se prepara cafeaua.");

    }
}
