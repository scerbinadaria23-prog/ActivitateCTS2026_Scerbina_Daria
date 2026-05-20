package ro.ase.cts.program;

import ro.ase.cts.clase.ComandaOcupare;
import ro.ase.cts.clase.ComandaRezervare;
import ro.ase.cts.clase.MasaRestaurant;
import ro.ase.cts.clase.Operator;

public class Main {
    public static void main(String[] args) {
        MasaRestaurant masa1 = new MasaRestaurant(1);
        MasaRestaurant masa2 = new MasaRestaurant(2);
        MasaRestaurant masa3 =new MasaRestaurant(3);

        Operator operator = new Operator();

        operator.adaugaComanda(new ComandaRezervare(masa1));
        operator.adaugaComanda(new ComandaOcupare(masa2));
        operator.adaugaComanda(new ComandaRezervare(masa3));

        operator.executaComenzi();

    }
}