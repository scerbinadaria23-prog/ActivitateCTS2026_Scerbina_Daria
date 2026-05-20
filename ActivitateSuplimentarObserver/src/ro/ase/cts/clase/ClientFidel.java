package ro.ase.cts.clase;

public class ClientFidel implements Observer {
    private String numeClient;

    public ClientFidel(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Clientul " + this.numeClient + " a primit notificarea: " + mesaj);

    }
}
