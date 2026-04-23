package ro.ase.cts.factory;

import ro.ase.cts.clase.Cafea;
import ro.ase.cts.clase.Ceai;
import ro.ase.cts.clase.CiocolataCalda;
import ro.ase.cts.clase.IBautura;

public class FabricaBauturi {
    public static FabricaBauturi instance;

    public FabricaBauturi() {
    }

    public static FabricaBauturi getInstance() {
        if (instance == null) {
            instance = new FabricaBauturi();
        }
        return instance;
    }

    public IBautura getBautura(TipBautura tip, String nume, int volum, double pret) {
        if (tip == TipBautura.CAFEA) {
            return new Cafea(nume, volum, pret);
        }
        if (tip == TipBautura.CEAI) {
            return new Ceai(nume, volum, pret);
        }
        if (tip == TipBautura.CIOCOLATACALDA) {
            return new CiocolataCalda(nume, volum, pret);
        }
        return null;
    }


}