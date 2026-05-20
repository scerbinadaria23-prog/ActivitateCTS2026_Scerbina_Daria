package ro.ase.cts.clase;

public class NotificatorSMS extends AbstractNotificator{
    @Override
    public void notifica(ClientRestaurant clientRestaurant, String mesaj) {
        if (clientRestaurant.getNrTelefon() != null && !clientRestaurant.getNrTelefon().isEmpty()){
            System.out.println("Clientul " + clientRestaurant.getNumeClient() +
                    " a primit SMS la numarul " + clientRestaurant.getNrTelefon() +
                    ": " + mesaj);
        } else {
            if (urmator != null){
                urmator.notifica(clientRestaurant, mesaj);
            }
        }
    }
}
