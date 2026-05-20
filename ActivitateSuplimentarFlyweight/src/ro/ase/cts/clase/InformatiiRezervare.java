package ro.ase.cts.clase;

public class InformatiiRezervare {
    private int nrMasa;
    private int nrPersoane;
    private String oraRezervare;

    public InformatiiRezervare(int nrMasa, int nrPersoane, String oraRezervare) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.oraRezervare = oraRezervare;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public String getOraRezervare() {
        return oraRezervare;
    }
}
