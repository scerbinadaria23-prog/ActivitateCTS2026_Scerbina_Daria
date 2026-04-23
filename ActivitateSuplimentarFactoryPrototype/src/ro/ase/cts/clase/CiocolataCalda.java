package ro.ase.cts.clase;

public class CiocolataCalda extends ABautura{
    public CiocolataCalda(String nume, int volum, double pret) {
        super(nume, volum, pret);
    }

    @Override
    public void preparare() {
        System.out.println("Se prepara ciocolatat calda.");

    }
}
