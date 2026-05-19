package ro.ase.cts.STB.clase;

public class UsaAutobuz {
    private String pozitie;

    public UsaAutobuz(String pozitie) {
        this.pozitie = pozitie;
    }

    public void puneInModLiber(){
        System.out.println("Usa " + pozitie + " a fost pusa in modul liber.");
    }
    public void deschidefortat(){
        System.out.println("Usa " + pozitie + " a fost deschisa fortat.");
    }
}
