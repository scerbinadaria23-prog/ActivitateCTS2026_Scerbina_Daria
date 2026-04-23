package ro.ase.cts.main;

import ro.ase.cts.factory.FabricaMasini;
import ro.ase.cts.factory.TipMasina;
import ro.ase.cts.lazy.AMasina;
import ro.ase.cts.lazy.MasinaBenzina;
import ro.ase.cts.lazy.MasinaElectrica;
import ro.ase.cts.lazy.ServiceAuto;

public class Main {
    public static void main(String[] args) throws Exception {
        //ServiceAuto s = ServiceAuto.getInstance("ServiceAuto");

        //AMasina m1 = new MasinaBenzina("B234AV", 2019, 300);
        //AMasina m2 = new MasinaElectrica("B3473A", 2023, 1200);
        //AMasina m3 = new MasinaBenzina("B784AV", 2017, 600);
        //AMasina m4 = new MasinaElectrica("B3465A", 2025, 1600);
        //s.intrareService(m1);
        //s.intrareService(m2);
        //s.iesireService();
        //s.intrareService(m2);
        //s.intrareService(m3);

        ServiceAuto service1 = ServiceAuto.getInstance("Service Auto");
        ServiceAuto service2=ServiceAuto.getInstance("Alt Service");

        FabricaMasini factory= FabricaMasini.getInstance();

        AMasina m1 = factory.getMasina("B111AAA", 2020, TipMasina.SUV);
        AMasina m2 = factory.getMasina("B222BBB", 2019, TipMasina.SEDAN);
        AMasina m3 = factory.getMasina("B333CCC", 2021, TipMasina.VAN);
        AMasina m4 = factory.getMasina("B444DDD", 2018, TipMasina.SUV);

        service1.intrareService(m1);
        service2.intrareService(m2);

        service1.iesireService();

        service2.intrareService(m2);

        service1.iesireService();

        service2.intrareService(m3);

        service1.iesireService();

        service2.intrareService(m4);;

    }
}



