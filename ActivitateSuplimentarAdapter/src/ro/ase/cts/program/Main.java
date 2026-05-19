package ro.ase.cts.program;

import ro.ase.cts.clase.AbstractComandaRestaurant;
import ro.ase.cts.clase.AdapterPlatformaExterna;
import ro.ase.cts.clase.PlatformaExterna;
import ro.ase.cts.clase.PlatformaInterna;

public class Main {
    public static void afiseazaComanda(AbstractComandaRestaurant comanda){
        System.out.println("Nume Client: " + comanda.obtineNumeClient() + " Produs comandat: " + comanda.obtineProdusComandat() + " Adresa livrare: " + comanda.obtineAdresaLivrare());
    }
    public static void main(String[] args) {
        System.out.println("Platforma interna: ");
        PlatformaInterna platformaInterna = new PlatformaInterna("Maria", "Pizza", "Sector 3");
        afiseazaComanda(platformaInterna);


        PlatformaExterna platformaExterna = new PlatformaExterna("Marcel", "Colaci", "Sector 4");
        AbstractComandaRestaurant platformaExternaAdaptat= new AdapterPlatformaExterna(platformaExterna);
        System.out.println("Platorma externa adaptata: ");
        afiseazaComanda(platformaExternaAdaptat);
        }
    }
