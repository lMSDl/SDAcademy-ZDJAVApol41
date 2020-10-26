package pl.sdacademy.JavaAdvanced.ex27;

import pl.sdacademy.JavaAdvanced.ex12.Car;
import pl.sdacademy.JavaAdvanced.ex12.Engine;
import pl.sdacademy.JavaAdvanced.ex12.Manufacturer;

import java.util.ArrayList;

public class MainJoiner {
    public static void main(String[] args) {

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car("Yaris", "Classic", 2015, new Manufacturer("Toyota", 1937, "Japan"), 80_000.00f, Engine.V12));
        carList.add(new Car("Model S", "Classic", 2018, new Manufacturer("Tesla", 2003, "USA"), 50_000.00f, Engine.S4));
        carList.add(new Car("i8", "Coupe", 2013, new Manufacturer("BMW", 1916, "Germany"), 70_000.00f, Engine.S3));
        carList.add(new Car("SantaFe", "SUV", 2004, new Manufacturer("Hyundai", 1967, "South Korea"), 104_000.00f, Engine.V6));
        carList.add(new Car("126p", "Convertible", 2000, new Manufacturer("Fiat", 1899, "Italy"), 7_000_000.00f, Engine.V12));
        carList.add(new Car("Mustang", "Convertible", 2020, new Manufacturer("Ford", 1903, "USA"), 170_000.00f, Engine.S6));
        carList.add(new Car("E36", "Coupe", 1999, new Manufacturer("BMW", 1916, "Germany"), 20_000.00f, Engine.S4));
        carList.add(new Car("Model Y", "SUV", 2017, new Manufacturer("Tesla", 2003, "USA"), 291_000.00f, Engine.S4));
        carList.add(new Car("Outlander", "SUV", 2018, new Manufacturer("Mitsubishi", 1870, "Japan"), 124_000.00f, Engine.V8));
        carList.add(new Car("6", "Saloon", 2007, new Manufacturer("Mazda", 1920, "Japan"), 101_000.00f, Engine.S3));
        carList.add(new Car("Qashqai", "SUV", 2010, new Manufacturer("Nissan", 1933, "Japan"), 53_000.00f, Engine.S6));
        carList.add(new Car("Megane", "Hatchback", 2020, new Manufacturer("Renault", 1898, "France"), 13_000.00f, Engine.V6));
        carList.add(new Car("S8", "Saloon", 2019, new Manufacturer("Audi", 1932, "Germany"), 439_000.00f, Engine.V8));
        carList.add(new Car("Golf", "Hatchback", 1995, new Manufacturer("Volkswagen", 1937, "Germany"), 9_000.00f, Engine.V12));
        Joiner<Car> joiner = new Joiner<Car>("%%%%%%%%% ");

        System.out.println("joiner.join(carList) = " + joiner.join(carList));
        System.out.println();
        System.out.println("joiner.joinReduce(carList) = " + joiner.joinReduce(carList));


    }
}
