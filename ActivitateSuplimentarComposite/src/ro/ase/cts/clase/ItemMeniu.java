package ro.ase.cts.clase;

public class ItemMeniu implements Optiune {
    private String numeItem;
    private double pret;

    public ItemMeniu(String numeItem, double pret) {
        this.numeItem = numeItem;
        this.pret = pret;
    }

    @Override
    public void stergeNod(Optiune optiune) {
        System.out.println("Nu se poate sterge nod dintr-un meniu.");
    }

    @Override
    public void adaugaNod(Optiune optiune) {
        System.out.println("Nu se poate adauga nod intr-un item de meniu.");
    }

    @Override
    public Optiune getNod(int index) {
        System.out.println("Itemiul de meniu nu contine noduri.");
        return null;
    }

    @Override
    public void descriere() {
        System.out.println("Item meniu: " + this.numeItem + " - pret: " + this.pret + " lei");
    }
}
