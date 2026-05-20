package ro.ase.cts.clase;

public class NotificatorManager extends AbstractNotificator {

    @Override
    public void notifica(ClientRestaurant clientRestaurant, String mesaj) {
        System.out.println("Managerul restaurantului a fost notificat: clientul "
                + clientRestaurant.getNumeClient()
                + " nu are date de contact.");
    }
}
