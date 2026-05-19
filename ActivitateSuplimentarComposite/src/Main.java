import ro.ase.cts.clase.Categorie;
import ro.ase.cts.clase.ItemMeniu;
import ro.ase.cts.clase.Optiune;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Optiune meniuRestaurant = new Categorie("Meniu restaurant");

        Optiune startere = new Categorie("Startere");
        Optiune bauturi = new Categorie("Bauturi");
        Optiune desert = new Categorie("Desert");

        Optiune sucuri = new Categorie("Sucuri");
        Optiune cafea = new Categorie("Cafea");

        Optiune bruschete = new ItemMeniu("Bruschete", 24);
        Optiune apaPlata = new ItemMeniu("Apa plata", 8);
        Optiune apaMinerala = new ItemMeniu("Apa minerala", 8);
        Optiune cocaCola = new ItemMeniu("Coca-Cola", 10);
        Optiune fanta = new ItemMeniu("Fanta", 10);
        Optiune espresso = new ItemMeniu("Espresso", 12);
        Optiune cappuccino = new ItemMeniu("Cappuccino", 15);
        Optiune papanasi = new ItemMeniu("Papanasi", 28);


        meniuRestaurant.adaugaNod(startere);
        meniuRestaurant.adaugaNod(bauturi);
        meniuRestaurant.adaugaNod(desert);

        startere.adaugaNod(bruschete);

        bauturi.adaugaNod(sucuri);
        bauturi.adaugaNod(cafea);
        bauturi.adaugaNod(apaPlata);
        bauturi.adaugaNod(apaMinerala);

        sucuri.adaugaNod(cocaCola);
        sucuri.adaugaNod(fanta);

        cafea.adaugaNod(espresso);
        cafea.adaugaNod(cappuccino);

        desert.adaugaNod(papanasi);

        System.out.println("Afisare meniu restaurant:");
        meniuRestaurant.descriere();

        System.out.println();

        System.out.println("Dupa stergerea apei minerale:");
        bauturi.stergeNod(apaMinerala);
        meniuRestaurant.descriere();

    }
}