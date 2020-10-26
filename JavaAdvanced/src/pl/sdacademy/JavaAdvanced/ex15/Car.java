package pl.sdacademy.JavaAdvanced.ex15;

import java.util.Comparator;

public enum Car {
    FERRARI(500000, 650),
    PORSCHE(450000, 600),
    MERCEDES(300000, 400),
    BMW(70000, 200),
    OPEL(90000, 120),
    FIAT(40000, 100),
    TOYOTA(100000, 110);

    private final int cena;
    private final int moc;


    Car(int cena, int moc) {
        this.cena = cena;
        this.moc = moc;
    }

    public int getMoc() {
        return moc;
    }

    public boolean isPremium() {
        return true;
    }

    public boolean isRegular() {
        return false;
    }

    public boolean isFasterThan(Car car) {
        return Integer.valueOf(moc).compareTo(car.getMoc()) > 0;

//        Integer firstCarPower = car.getMoc();
//        Integer secondCarPower = car2.getMoc();
//        if (firstCarPower.compareTo(secondCarPower) > 0)
//            return true;
//        return false;
    }
}
