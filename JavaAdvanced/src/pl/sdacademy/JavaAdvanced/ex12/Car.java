package pl.sdacademy.JavaAdvanced.ex12;

import java.util.List;
import java.util.Objects;

public class Car {
    private String name;
    private String model;
    private int yearOfProduction;
    private Manufacturer manufacturer;
    private float price;
    private Engine engine;

    public Car(String name, String model, int yearOfProduction, Manufacturer manufacturer, float price, Engine engine) {
        this.name = name;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.manufacturer = manufacturer;
        this.price = price;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfProduction == car.yearOfProduction &&
                Float.compare(car.price, price) == 0 &&
                name.equals(car.name) &&
                model.equals(car.model) &&
                manufacturer.equals(car.manufacturer) &&
                engine == car.engine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, yearOfProduction, manufacturer, price, engine);
    }
}
