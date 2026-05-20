package ro.ase.cts.clase;

public class ComandaRezervare implements Comanda{
    private MasaRestaurant masaRestaurant;

    public ComandaRezervare(MasaRestaurant masaRestaurant) {
        this.masaRestaurant = masaRestaurant;
    }

    @Override
    public void executa() {
        masaRestaurant.rezervaMasa();
    }
}
