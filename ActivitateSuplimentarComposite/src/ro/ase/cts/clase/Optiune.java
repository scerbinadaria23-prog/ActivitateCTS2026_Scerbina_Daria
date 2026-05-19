package ro.ase.cts.clase;

public interface Optiune {
    void stergeNod(Optiune optiune);
    void adaugaNod(Optiune optiune);
    Optiune getNod(int index);
    void descriere();
}
