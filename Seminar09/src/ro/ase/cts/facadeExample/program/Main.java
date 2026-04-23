package ro.ase.cts.facadeExample.program;

import ro.ase.cts.facadeExample.clase.Medic;
import ro.ase.cts.facadeExample.clase.Pacient;
import ro.ase.cts.facadeExample.clase.ReceptieSpital;
import ro.ase.cts.facadeExample.clase.Salon;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Ana", 7);
        Medic medic = new Medic();
        Salon salon = new Salon();
        if(pacient.getGravitate()>6){
            if(medic.areInregistratPacientul(pacient)){
                int nrPatLiber = salon.getPatLiber();
                if(nrPatLiber!=-1){
                    System.out.println("Pacientul " + pacient.getNume() +" este internat in patul " + nrPatLiber);
                    salon.ocupaPat(nrPatLiber);
                }
            }
        }

        Pacient pacient1 = new Pacient("Ion", 2);
        Pacient pacient2 = new Pacient("Maria", 9);
        Pacient pacient3 = new Pacient("Marcel", 5);

        ReceptieSpital spital = new ReceptieSpital(medic,salon);
        spital.internarePacient(pacient1);
        spital.internarePacient(pacient2);
        spital.internarePacient(pacient3);
    }
}