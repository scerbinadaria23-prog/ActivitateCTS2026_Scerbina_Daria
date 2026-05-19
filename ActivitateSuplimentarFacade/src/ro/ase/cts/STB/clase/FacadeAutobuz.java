package ro.ase.cts.STB.clase;

public class FacadeAutobuz {
    private UsaAutobuz usaFata;
    private UsaAutobuz usaMijloc;
    private UsaAutobuz usaSpate;

    public FacadeAutobuz() {
        this.usaFata = new UsaAutobuz("din fata");
        this.usaMijloc = new UsaAutobuz("de la mijloc");
        this.usaSpate = new UsaAutobuz("din spate");
    }

    public void puneToateUsileInModLiber(){
        usaFata.puneInModLiber();
        usaMijloc.puneInModLiber();
        usaSpate.puneInModLiber();
    }

    public void deschideFortatToateUsile(){
        usaFata.deschidefortat();
        usaMijloc.deschidefortat();
        usaSpate.deschidefortat();
    }
}
