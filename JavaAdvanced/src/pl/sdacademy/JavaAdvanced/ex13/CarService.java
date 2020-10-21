package pl.sdacademy.JavaAdvanced.ex13;

import pl.sdacademy.JavaAdvanced.ex12.Car;
import pl.sdacademy.JavaAdvanced.ex12.Engine;
import pl.sdacademy.JavaAdvanced.ex12.Manufacturer;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> carList;
    public CarService () {
     carList = new ArrayList<>();
     carList.add(new Car("Yaris", "Classic", 2015, new Manufacturer("Toyota", 1937,"Japan"), 70_000.00f, Engine.V12));
        carList.add(new Car("i8", "Coupe", 2013, new Manufacturer("BMW", 1916,"Germany"), 600_000.00f, Engine.S3));
        carList.add(new Car("model s", "Classic", 2018, new Manufacturer("Tesla", 2003,"USA"), 654_000.00f, Engine.S4));

    }

    public void add (Car car) {
        carList.add(car);
    }

    public boolean remove (Car car) {
        return carList.remove(car);
    }

    public List<Car> getList() {
        return new ArrayList<>(carList);
    }
}
