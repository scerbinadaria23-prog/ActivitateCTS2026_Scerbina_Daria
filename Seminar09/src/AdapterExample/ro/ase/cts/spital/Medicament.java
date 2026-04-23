package AdapterExample.ro.ase.cts.spital;

public class Medicament {
    private String numeMedicament;
    private float pretmedicament;

    public Medicament(String numeMedicament, float pretmedicament) {
        this.numeMedicament = numeMedicament;
        this.pretmedicament = pretmedicament;
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public void achizitioneazaMedicament(){
        if (prezintaReteta()){
            System.out.println("Este achizitionat medicamentul " + this.numeMedicament + " la pret de " + this.pretmedicament + ".");
        }else{
            System.out.println("Pentru medicamentul " + this.numeMedicament + " este nevoie de reteta!")  ;
        }
    }
    private boolean prezintaReteta(){
        return numeMedicament.contains("reteta");
        }
    }