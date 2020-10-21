package pl.sdacademy.JavaAdvanced.ex13;

public class CarMain {
    public static void main(String[] args) {
        CarService carService = new CarService();

        System.out.println("size list of cheapest: " + carService.getCheapestCarList().toString());
        System.out.println(carService.getMostExpensive().getName());

        System.out.println(carService.getBefore1999());
    }
}
