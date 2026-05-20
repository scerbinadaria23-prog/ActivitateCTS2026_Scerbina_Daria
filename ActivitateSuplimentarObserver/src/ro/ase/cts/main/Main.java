package ro.ase.cts.main;

import ro.ase.cts.clase.ClientFidel;
import ro.ase.cts.clase.Restaurant;
public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("La Bunica");

        ClientFidel client1 = new ClientFidel("Maria");
        ClientFidel client2 = new ClientFidel("Ivan");
        ClientFidel client3 = new ClientFidel("Dumitru");

        restaurant.adaugaObserver(client1);
        restaurant.adaugaObserver(client2);
        restaurant.adaugaObserver(client3);

        restaurant.adaugaOfertaNoua("Reducere 30% la pizza");
        System.out.println();

        restaurant.adagaMeniuNou("Meniu de vara");
        System.out.println();

        restaurant.stergeObserver(client2);
        restaurant.adaugaOfertaNoua("1+1 gratis la paste");

    }
}