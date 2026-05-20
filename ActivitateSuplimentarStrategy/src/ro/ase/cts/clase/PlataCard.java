package ro.ase.cts.clase;

public class PlataCard implements ModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("Plata in valoare de " + suma + "lei a fost realizata cu cardul.");
    }
}
