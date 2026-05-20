package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Comanda> listaComenzi;

    public Operator() {
        this.listaComenzi = new ArrayList<>();
    }

    public void adaugaComanda(Comanda comanda){
        listaComenzi.add(comanda);
    }

    public void executaComenzi(){
        for (Comanda comanda : listaComenzi){
            comanda.executa();
        }
        listaComenzi.clear();
    }
}
