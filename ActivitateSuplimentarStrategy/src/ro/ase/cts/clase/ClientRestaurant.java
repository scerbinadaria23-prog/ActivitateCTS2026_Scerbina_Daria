package ro.ase.cts.clase;

public class ClientRestaurant {
    private String numeClient;
    private ModPlata modPlata;

    public ClientRestaurant(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void platesteNota(double suma){
        if (modPlata != null){
            System.out.println("Clientul " + this.numeClient + " efectueaza plata.");
            modPlata.plateste(suma);
        }else {
            System.out.println("Clientul " + this.numeClient + " nu a ales metoda de plata.");
        }
    }
}
