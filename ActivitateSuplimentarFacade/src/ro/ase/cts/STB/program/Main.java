package ro.ase.cts.STB.program;

import ro.ase.cts.STB.clase.FacadeAutobuz;

public class Main {
    public static void main(String[] args) {
        FacadeAutobuz facadeAutobuz = new FacadeAutobuz();

        System.out.println("Punerea tuturor usilor in modul liber:");
        facadeAutobuz.puneToateUsileInModLiber();

        System.out.println();

        System.out.println("Deschiderea tuturor usilor fortat: ");
        facadeAutobuz.deschideFortatToateUsile();
    }
}