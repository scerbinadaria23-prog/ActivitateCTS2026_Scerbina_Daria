package ro.ase.cts.Scerbina.Daria.g1096.patternSingletone;

public abstract class AbstractMembership implements IAbstractMembership {
    private static AbstractMembership instance = null;
    private String tipAbonament;
    private double pret;

    public AbstractMembership(String tipAbonament, double pret) {
        this.tipAbonament = tipAbonament;
        this.pret = pret;
    }

    public static synchronized AbstractMembership getInstance(String tip Abonament)
    @Override
    public void descriere() {

    }
}
