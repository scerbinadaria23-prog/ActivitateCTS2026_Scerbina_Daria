package ro.ase.cts.clase;

public class NotificatorEmail extends AbstractNotificator {

    @Override
    public void notifica(ClientRestaurant clientRestaurant, String mesaj) {
        if (clientRestaurant.getAdresaMail() != null && !clientRestaurant.getAdresaMail().isEmpty()) {
            System.out.println("Clientul " + clientRestaurant.getNumeClient()
                    + " a primit email la adresa " + clientRestaurant.getAdresaMail()
                    + ": " + mesaj);
        } else {
            if (urmator != null) {
                urmator.notifica(clientRestaurant, mesaj);
            }
        }
    }
}