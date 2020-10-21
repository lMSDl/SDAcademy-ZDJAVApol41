package pl.sdacademy.JavaAdvanced.ex13;

import pl.sdacademy.JavaAdvanced.ex12.Car;
import pl.sdacademy.JavaAdvanced.ex12.Engine;
import pl.sdacademy.JavaAdvanced.ex12.Manufacturer;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
        carList.add(new Car("Yaris", "Classic", 2015, new Manufacturer("Toyota", 1937, "Japan"), 80_000.00f, Engine.V12));
        carList.add(new Car("model s", "Classic", 2018, new Manufacturer("Tesla", 2003, "USA"), 50_000.00f, Engine.S4));
        carList.add(new Car("i8", "Coupe", 2013, new Manufacturer("BMW", 1916, "Germany"), 70_000.00f, Engine.S3));

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

    public boolean tellMeIfItISTruCar(String carName) {

        for (Car car : carList) {

            if (car.getName().equals(carName)){
                System.out.print("mamy na stanie! " + carName + " ");
            return true;}
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
