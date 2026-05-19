package ro.ase.cts.decorator;

import ro.ase.cts.clase.AbstractBonDeCasa;
import ro.ase.cts.clase.BonDeCasa;

public abstract class DecoratorBonDeCasa implements AbstractBonDeCasa {
    private AbstractBonDeCasa bonDeCasa;

    public DecoratorBonDeCasa(AbstractBonDeCasa bonDeCasa) {
        this.bonDeCasa = bonDeCasa;
    }

    @Override
    public void printeazaBon() {
        bonDeCasa.printeazaBon();
    }

    public abstract void printeazaFelicitare();
}
