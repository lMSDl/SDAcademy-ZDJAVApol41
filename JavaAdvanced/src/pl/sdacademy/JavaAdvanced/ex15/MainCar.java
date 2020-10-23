package pl.sdacademy.JavaAdvanced.ex15;

public class MainCar{
    public static void main(String[] args) {

        System.out.println(Car.FERRARI.isFasterThan(Car.MERCEDES));
        System.out.println(Car.PORSCHE.isFasterThan(Car.FIAT));
        System.out.println(Car.FERRARI.isFasterThan(Car.BMW));
        System.out.println(Car.BMW.isFasterThan(Car.FERRARI));
        System.out.println(Car.BMW.isFasterThan(Car.MERCEDES));
        System.out.println(Car.OPEL.isFasterThan(Car.FERRARI));


    }


}
