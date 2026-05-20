package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subiect{
    private String numeRestaurant;
    private List<Observer> listaObserveri;

    public Restaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
        this.listaObserveri = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        listaObserveri.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        listaObserveri.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(Observer observer : listaObserveri){
            observer.primesteNotificare(mesaj);
        }

    }

    public void adaugaOfertaNoua(String oferta) {
        trimiteNotificare("Restaurantul " + this.numeRestaurant +
                " are o noua oferta: " + oferta);
    }

    public void adagaMeniuNou(String meniu){
        trimiteNotificare("Restaurantul " + this.numeRestaurant +
                " a introdus un nou meniu: " + meniu);
    }
}
