package pl.sdacademy.JavaAdvanced.ex13;

import pl.sdacademy.JavaAdvanced.ex12.Car;

import java.util.Comparator;

public class SortByPriceFromCheapestToMostExpensive implements Comparator<Car> {


    @Override
    public int compare(Car o1, Car o2) {
        int result = (int)o1.getPrice() - (int)o2.getPrice();
        return result;
    }
}
