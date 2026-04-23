package ro.ase.cts.prototype;

public class BauturaPresetata implements IProtorypeBautura{
    private String nume;
    private int volum;
    private double pret;
    private boolean topping;

    public BauturaPresetata(String nume, int volum, double pret, boolean topping) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
        this.topping = topping;
    }

    @Override
    public IProtorypeBautura copiaza() {
        return new BauturaPresetata(this.nume, this.volum, this.pret, this.topping);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BauturaPresetata{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", volum=").append(volum);
        sb.append(", pret=").append(pret);
        sb.append(", topping=").append(topping);
        sb.append('}');
        return sb.toString();
    }

    public void setVolum(int volum) {
        this.volum = volum;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }
}
