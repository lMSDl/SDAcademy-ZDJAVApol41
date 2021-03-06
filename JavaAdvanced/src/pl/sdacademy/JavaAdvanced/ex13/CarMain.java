package pl.sdacademy.JavaAdvanced.ex13;

public class CarMain {
    public static void main(String[] args) {
        CarService carService = new CarService();

        System.out.println("size list of cheapest: " + carService.getCheapestCarList().toString());
        System.out.println(carService.getMostExpensive().getName());

        System.out.println(carService.getBefore1999());

        System.out.println("sorted by name: " + carService.sortByName());
        System.out.println("Sorted By Price From Cheapest To Most Expensive: " + carService.SortByPriceFromCheapestToMostExpensive());
        System.out.println("Sorted By Price From Most Expensive To Cheapest: " + carService.SortByPriceFromMostExpensiveToCheapest());

        System.out.println("Czy mamy na zstanie?");
        System.out.println(carService.tellMeIfItISTrueCar("Yaris"));
        carService.tellMeIfItISTrueCarStream("Yaris");
        carService.tellMeIfItISTrueCarStream("nieYaris");
        carService.tellMeIfItISTrueCarModelStream("SUV");
        System.out.println();
        System.out.println(carService.sortByCarNameStream(carService.getList()));
        System.out.println(carService.sortByCarModelStream(carService.getList()));
    }
}
