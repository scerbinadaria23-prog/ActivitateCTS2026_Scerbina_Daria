package ro.ase.cts.facadeExample.clase;

public class ReceptieSpital {
    private Medic medic;
    private Salon salon;

    public ReceptieSpital(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void internarePacient(Pacient pacient){
        if(pacient.getGravitate()>4){
            if(medic.areInregistratPacientul(pacient)){
                int nrPatLiber = salon.getPatLiber();
                if(nrPatLiber!=-1){
                    System.out.println("Pacientul " + pacient.getNume() +" este internat in patul " + nrPatLiber);
                    salon.ocupaPat(nrPatLiber);
                }
                else{
                    System.out.println("Nu avem paturi libere.");
                }
            }
            else{
                System.out.println("Trebuie trimitere de la medic.");
            }
        }
        else{
            System.out.println("Nu e atat de grav.");
        }
    }
}
