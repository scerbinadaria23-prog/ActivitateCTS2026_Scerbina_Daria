package ro.ase.cts.animale;

public class Zebra extends Animal{
    private int nrDungi;

    @Override
    public void eat(String numeZooKeper) {
        System.out.println("Zookeperul " + numeZooKeper + " hraneste zebra " + super.name + " cu " + super.food);
    }

    public Zebra(String name, int age, String food, int nrDungi) {
        super(name, age, food);
        this.nrDungi = nrDungi;
    }
}
