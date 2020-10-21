package pl.sdacademy.JavaAdvanced.ex13;

import pl.sdacademy.JavaAdvanced.ex12.Car;

import java.util.Comparator;

public class SortByName implements Comparator<Car> {


    @Override
    public int compare(Car o1, Car o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
