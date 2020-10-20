package pl.sdacademy.JavaAdvanced.ex7;

import java.util.*;

public class Gun {
    private final int rozmiarMagazynka;
    // private int iloscNaboiWMagazynku = 0;
    private Stack<String> stringiWMagazynku = new Stack<>();


    public Gun(int rozmiarMagazynka) {
        this.rozmiarMagazynka = rozmiarMagazynka;
    }

    public void loadBullet(String bullet) {
        if (stringiWMagazynku.size() < rozmiarMagazynka) {
            stringiWMagazynku.push(bullet);
        } else {
            System.out.println("Nie mozna załadowac naboju");
        }
    }

    public boolean isLoaded() {
       /* if (iloscNaboiWMagazynku == 0){
            System.out.println("Pusty magazynek!");
            return false;
        }else {
            System.out.println("W magazynku jest " + iloscNaboiWMagazynku + " nabojów.");
            return true;
        }
        */
        return !stringiWMagazynku.isEmpty();
    }

    public void shot() {
        if (isLoaded()) {
            var bullet = stringiWMagazynku.pop();
            System.out.println(bullet);
        } else {
            System.out.println("Nie ma czym strzelać!");
        }
    }



}
