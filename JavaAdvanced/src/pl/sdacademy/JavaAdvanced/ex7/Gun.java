package pl.sdacademy.JavaAdvanced.ex7;

import java.util.ArrayList;
import java.util.List;

public class Gun {
    private final int rozmiarMagazynka;
    private int iloscNaboiWMagazynku = 0;
    private List<String> stringiWMagazynku = new ArrayList<>();


    public Gun(int rozmiarMagazynka) {
        this.rozmiarMagazynka = rozmiarMagazynka;
    }

    public void loadBullet(String bullet) {
        if (iloscNaboiWMagazynku < rozmiarMagazynka) {
            stringiWMagazynku.add(bullet);
            iloscNaboiWMagazynku++;
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
        return iloscNaboiWMagazynku > 0;
    }

    public void shot() {
        if (isLoaded()) {
            var bullet = stringiWMagazynku.remove((--iloscNaboiWMagazynku));
            System.out.println(bullet);
        }else {
            System.out.println("Nie ma czym strzelać!");
        }
    }


}
