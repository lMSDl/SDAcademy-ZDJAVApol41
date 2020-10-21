package pl.sdacademy.JavaAdvanced.ex13;

import pl.sdacademy.JavaAdvanced.ex12.Car;

import java.util.Comparator;

public class SortByPriceFromMostExpensiveToCheapest implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return (int)o2.getPrice() - (int)o1.getPrice();
    }
}
