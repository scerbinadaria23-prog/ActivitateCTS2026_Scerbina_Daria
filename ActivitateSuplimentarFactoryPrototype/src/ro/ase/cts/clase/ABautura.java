package ro.ase.cts.clase;

public abstract class ABautura implements IBautura {
    protected String nume;
    protected int volum;
    protected double pret;

    protected ABautura(String nume, int volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    @Override
    public String getDetalii() {
        final StringBuilder sb = new StringBuilder("ABautura{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", volum=").append(volum);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double getPret() {
        return pret;
    }
}

