package pl.sdacademy.JavaAdvanced.ex15;

public class MainCar {
    public static void main(String[] args) {

        System.out.println(Car.isFasterThan(Car.MERCEDES, Car.FERRARI));
        System.out.println(Car.isFasterThan(Car.FERRARI, Car.MERCEDES));
        System.out.println(Car.isFasterThan(Car.PORSCHE, Car.MERCEDES));
        System.out.println(Car.isFasterThan(Car.BMW, Car.MERCEDES));
        System.out.println(Car.isFasterThan(Car.OPEL, Car.MERCEDES));
        System.out.println(Car.isFasterThan(Car.FERRARI, Car.FIAT));
        System.out.println(Car.isFasterThan(Car.TOYOTA, Car.MERCEDES));
        System.out.println(Car.isFasterThan(Car.BMW, Car.FIAT));
        System.out.println(Car.isFasterThan(Car.TOYOTA, Car.OPEL));

    }


}
