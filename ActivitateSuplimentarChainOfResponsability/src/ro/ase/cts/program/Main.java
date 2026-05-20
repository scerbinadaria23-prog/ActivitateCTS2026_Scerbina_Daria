package ro.ase.cts.program;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        ClientRestaurant client1 = new ClientRestaurant("Maria", "0712345678", "maria@gmail.com");
        ClientRestaurant client2 = new ClientRestaurant("Ion", "", "ion@gmail.com");
        ClientRestaurant client3 = new ClientRestaurant("Andrei", "", "");

        AbstractNotificator notificatorSMS = new NotificatorSMS();
        AbstractNotificator notificatorEmail = new NotificatorEmail();
        AbstractNotificator notificatorManager = new NotificatorManager();

        notificatorSMS.seteazaUrmator(notificatorEmail);
        notificatorEmail.seteazaUrmator(notificatorManager);

        String mesaj = "Restaurantul are o oferta noua pentru clientii fideli.";

        System.out.println("Notificare client 1:");
        notificatorSMS.notifica(client1, mesaj);

        System.out.println();

        System.out.println("Notificare client 2:");
        notificatorSMS.notifica(client2, mesaj);

        System.out.println();

        System.out.println("Notificare client 3:");
        notificatorSMS.notifica(client3, mesaj);
    }
}