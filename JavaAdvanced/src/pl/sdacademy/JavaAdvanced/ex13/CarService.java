package pl.sdacademy.JavaAdvanced.ex13;

import pl.sdacademy.JavaAdvanced.ex12.Car;
import pl.sdacademy.JavaAdvanced.ex12.Engine;
import pl.sdacademy.JavaAdvanced.ex12.Manufacturer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
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
    }

    public void add(Car car) {
        carList.add(car);
    }

    public boolean remove(Car car) {
        return carList.remove(car);
    }

    public List<Car> getList() {
        return new ArrayList<>(carList);
    }

    public List<Car> getV12() {
        List<Car> results = new ArrayList<>();
        for (Car car : carList) {
            if (car.getEngine() == Engine.V12) {
                results.add(car);
            }
        }
        return results;
    }

    public List<Car> getBefore1999() {
        List<Car> localResult = new ArrayList<>();
        for (Car car : carList) {
            if (car.getYearOfProduction() < 1999) {
                localResult.add(car);
            }
        }
        return localResult;
    }

    public Car getMostExpensive() {
        Car result = carList.get(0);
        for (int i = 1; i < carList.size(); i++) {
            if (result.getPrice() < carList.get(i).getPrice()) {
                result = carList.get(i);
            }
        }
        return result;
    }

    public List<Car> getCheapestCarList() {

        List<Car> localList = new ArrayList<>();
        Car result = carList.get(0);
        for (int i = 1; i < carList.size(); i++) {
            if (result.getPrice() > carList.get(i).getPrice()) {
                result = carList.get(i);
            }
        }
        localList.add(result);
        for (int i = 1; i < carList.size(); i++) {
            if (result.getPrice() == carList.get(i).getPrice()) {
                localList.add(carList.get(i));
            }
        }
        return localList;
    }

    public List<Car> sortByCarModelStream(List<Car> cars) {
        return cars.stream()
                .sorted((a, b) -> a.getModel().compareToIgnoreCase(b.getModel()))
                .collect(Collectors.toList());
    }

    public List<Car> sortByCarNameStream(List<Car> cars) {
        return cars.stream()
                .sorted((a, b) -> a.getName().compareToIgnoreCase(b.getName()))
                .collect(Collectors.toList());
    }

    public List<Car> sortByName() {
        List<Car> localList = new ArrayList<>(carList);
        localList.sort(new SortByName());

        return localList;
    }

    public List<Car> SortByPriceFromCheapestToMostExpensive() {
        List<Car> locallist = new ArrayList<>(carList);
        locallist.sort(new SortByPriceFromCheapestToMostExpensive());

        return locallist;
    }

    public List<Car> SortByPriceFromMostExpensiveToCheapest() {
        List<Car> locallist = new ArrayList<>(carList);
        locallist.sort(new SortByPriceFromMostExpensiveToCheapest());

        return locallist;
    }

    public void tellMeIfItISTrueCarModelStream(String carModel) {
        carList.stream()
                .filter(car -> car.getModel().equals(carModel))
                .forEach(car -> System.out.println("Jest na stanie : " + car));
    }

    public void tellMeIfItISTrueCarStream(String carName) {
        carList.stream()
                .filter(car -> car.getName().equals(carName))
                .forEach(car -> System.out.println("Jest na stanie : " + car));
    }

    public boolean tellMeIfItISTrueCar(String carName) {

        for (Car car : carList) {

            if (car.getName().equals(carName)) {
                System.out.print("mamy na stanie! " + carName + " ");
                return true;
            }
        }
        System.out.print("nie ma na stanie! " + carName + " ");
        return false;
    }


    @Override
    public String toString() {
        return "CarService{" +
                "carList=" + carList +
                '}';
    }
}
