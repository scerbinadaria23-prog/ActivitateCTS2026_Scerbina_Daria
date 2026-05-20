package ro.ase.cts.clase;

public interface Subiect {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void trimiteNotificare(String mesaj);
}
