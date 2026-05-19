package ro.ase.cts.decorator;

import ro.ase.cts.clase.AbstractBonDeCasa;

public class DecoratorFelicitare extends DecoratorBonDeCasa{

    public DecoratorFelicitare(AbstractBonDeCasa bonDeCasa) {
        super(bonDeCasa);
    }

    @Override
    public void printeazaBon() {
        super.printeazaBon();
        printeazaFelicitare();
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani!");
    }
}
