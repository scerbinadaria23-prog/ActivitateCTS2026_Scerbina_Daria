package ro.ase.cts.program;

import ro.ase.cts.clase.AbstractBonDeCasa;
import ro.ase.cts.clase.BonDeCasa;
import ro.ase.cts.decorator.DecoratorFelicitare;

public class Main {
    public static void main(String[] args) {
        AbstractBonDeCasa bonDeCasa = new BonDeCasa(145,560.5);
        System.out.println("Bon de casa initial: ");
        bonDeCasa.printeazaBon();

        System.out.println();
        AbstractBonDeCasa bonCufelicitare = new DecoratorFelicitare(bonDeCasa);
        System.out.println("Bon de casa decorat: ");
        bonCufelicitare.printeazaBon();
    }
}