package ro.ase.cts.clase;

public class MasaRestaurant {
    private int nrMasa;

    public MasaRestaurant(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public void rezervaMasa(){
        System.out.println("Masa " + this.nrMasa + " a fost rezervata.");
    }

    public void ocupaMasa(){
        System.out.println("Masa " + this.nrMasa + " a fost ocupata.");
    }
}
