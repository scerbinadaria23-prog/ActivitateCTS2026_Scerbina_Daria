package ro.ase.cts.program;

import ro.ase.cts.clase.ClientRestaurant;
import ro.ase.cts.clase.PlataCard;
import ro.ase.cts.clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        ClientRestaurant client1 = new ClientRestaurant("Maria");
        client1.setModPlata(new PlataCard());
        client1.platesteNota(150.5);

        System.out.println();

        ClientRestaurant client2 = new ClientRestaurant("Marcel");
        client2.setModPlata(new PlataCash());
        client2.platesteNota(80);

        System.out.println();

        ClientRestaurant client3 = new ClientRestaurant("Mihaela");
        client3.platesteNota(120);
    }
}