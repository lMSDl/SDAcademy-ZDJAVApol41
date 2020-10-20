package pl.sdacademy.JavaAdvanced.ex12;

import java.util.List;
import java.util.Objects;

public class Car {
    private String name;
    private String model;
    private String yearOfProduction;
    private List<Manufacturer> manufacturer;

    public Car(String name, String model, String yearOfProduction, List<Manufacturer> manufacturer) {
        this.name = name;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.manufacturer = manufacturer;
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

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(String yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public List<Manufacturer> getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(List<Manufacturer> manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return name.equals(car.name) &&
                model.equals(car.model) &&
                yearOfProduction.equals(car.yearOfProduction) &&
                manufacturer.equals(car.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, yearOfProduction, manufacturer);
    }
}
