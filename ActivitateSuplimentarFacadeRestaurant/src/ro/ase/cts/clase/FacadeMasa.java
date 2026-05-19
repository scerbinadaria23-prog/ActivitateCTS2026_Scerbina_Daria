package ro.ase.cts.clase;

public class FacadeMasa {
    private MasaLibera masaLibera;
    private MasaDebarasata masaDebarasata;
    private MasaServeteleNoi masaServeteleNoi;

    public FacadeMasa() {
        this.masaLibera = new MasaLibera();
        this.masaDebarasata = new MasaDebarasata();
        this.masaServeteleNoi = new MasaServeteleNoi();
    }

    public boolean poateFiOcupata(Masa masa) {
        boolean rezultat = masaLibera.verificaMasaLibera(masa)
                && masaDebarasata.verificaMasaDebarasata(masa)
                && masaServeteleNoi.verificaMasaAreServeteleNoi(masa);
    if(rezultat){
        System.out.println("Masa" + masa.getNrMasa() + " poate fi ocupata");
    }
    else {
        System.out.println("Masa" + masa.getNrMasa() + " nu poate fi ocupata");
    }
    return rezultat;
    }
}
