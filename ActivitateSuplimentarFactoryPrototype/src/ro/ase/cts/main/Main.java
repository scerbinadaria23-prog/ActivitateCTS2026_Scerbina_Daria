package ro.ase.cts.main;

import ro.ase.cts.clase.IBautura;
import ro.ase.cts.factory.TipBautura;
import ro.ase.cts.factory.FabricaBauturi;

public class Main {
    public static void main(String[] args) {
        FabricaBauturi fabricaBauturi = new FabricaBauturi();

        IBautura cafea = fabricaBauturi.getBautura(TipBautura.CAFEA, "Espresso", 150, 18);
        IBautura ceai = fabricaBauturi.getBautura(TipBautura.CEAI, "Ceai de musetel", 200, 25);
        IBautura ciocolataCalda = fabricaBauturi.getBautura(TipBautura.CIOCOLATACALDA, "Ciocolata alba", 250, 20.5);
        IBautura latte = fabricaBauturi.getBautura(TipBautura.CAFEA, "Latte", 300, 22);

        System.out.println(cafea.getDetalii());
        cafea.preparare();

        System.out.println(ceai.getDetalii());
        ceai.preparare();

        System.out.println(ciocolataCalda.getDetalii());
        ciocolataCalda.preparare();

        System.out.println(latte.getDetalii());
        latte.preparare();
    }
}