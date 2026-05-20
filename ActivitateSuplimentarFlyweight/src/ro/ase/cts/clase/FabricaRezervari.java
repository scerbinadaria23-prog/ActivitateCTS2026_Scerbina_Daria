package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaRezervari {
    private Map<String, AbstractRezervare> listaRezervari;

    public FabricaRezervari() {
        this.listaRezervari = new HashMap<>();
    }

    public AbstractRezervare getRezervareClient(String numeClient, String nrTelefon, String adresaMail) {
        AbstractRezervare rezervare = listaRezervari.get(nrTelefon);

        if(rezervare == null){
            rezervare = new RezervareClient(numeClient,nrTelefon,adresaMail);
            listaRezervari.put(nrTelefon,rezervare);
        }
        return rezervare;
    }

    public int getNumarClienti(){
        return listaRezervari.size();
    }
}
