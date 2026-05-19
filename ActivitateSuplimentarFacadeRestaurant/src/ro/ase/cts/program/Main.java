package ro.ase.cts.program;

import ro.ase.cts.clase.FacadeMasa;
import ro.ase.cts.clase.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(1, true, true, true);
        Masa masa2 = new Masa(2, false, true, true);
        Masa masa3 = new Masa(3, false, false, true);
        Masa masa4 = new Masa(4, true, true, false);
        FacadeMasa facadeMasa = new FacadeMasa();
        System.out.println("Verificare masa 1");
        facadeMasa.poateFiOcupata(masa1);
        System.out.println("Verificare masa 2");
        facadeMasa.poateFiOcupata(masa2);
        System.out.println("Verificare masa 3");
        facadeMasa.poateFiOcupata(masa3);
        System.out.println("Verificare masa 4");
        facadeMasa.poateFiOcupata(masa4);
    }
}