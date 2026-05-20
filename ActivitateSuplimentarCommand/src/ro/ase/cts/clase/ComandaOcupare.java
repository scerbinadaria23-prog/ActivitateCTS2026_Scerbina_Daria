package ro.ase.cts.clase;

public class ComandaOcupare implements Comanda{
    private MasaRestaurant masaRestaurant;

    public ComandaOcupare(MasaRestaurant masaRestaurant) {
        this.masaRestaurant = masaRestaurant;
    }

    @Override
    public void executa() {
        masaRestaurant.ocupaMasa();
    }
}
