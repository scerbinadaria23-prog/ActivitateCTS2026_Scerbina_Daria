package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Optiune {
    private String numeCategorie;
    private List<Optiune> listaOptiuni;

    public Categorie(String numeCategorie) {
        this.numeCategorie = numeCategorie;
        this.listaOptiuni = new ArrayList<>();
    }


    @Override
    public void stergeNod(Optiune optiune) {
        listaOptiuni.remove(optiune);
    }

    @Override
    public void adaugaNod(Optiune optiune) {
        listaOptiuni.add(optiune);
    }

    @Override
    public Optiune getNod(int index) {
        return listaOptiuni.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Categorie: " + this.numeCategorie);

        for(Optiune optiune : listaOptiuni){
            optiune.descriere();
        }

    }
}
