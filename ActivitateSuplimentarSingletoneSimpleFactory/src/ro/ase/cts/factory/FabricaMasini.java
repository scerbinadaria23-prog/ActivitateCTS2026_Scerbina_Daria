package ro.ase.cts.factory;

import ro.ase.cts.lazy.AMasina;
import ro.ase.cts.lazy.MasinaSUV;
import ro.ase.cts.lazy.MasinaSedan;
import ro.ase.cts.lazy.MasinaVan;

public class FabricaMasini {
    private static FabricaMasini instance;

    private FabricaMasini() {
    }

    public static FabricaMasini getInstance(){
        if(instance == null){
            instance = new FabricaMasini();
        }
        return instance;
    }
    public AMasina getMasina(String nrInmatriculare, int anFabricatie, TipMasina tip) throws Exception {
        if (tip == TipMasina.SUV) {
            return new MasinaSUV(nrInmatriculare, anFabricatie);
        }
        if (tip == TipMasina.SEDAN) {
            return new MasinaSedan(nrInmatriculare, anFabricatie);
        }
        if (tip == TipMasina.VAN) {
            return new MasinaVan(nrInmatriculare, anFabricatie);
        }
        throw new Exception("Tip invalid");
    }
}