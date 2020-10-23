package pl.sdacademy.JavaAdvanced.ex15;

public class CarComparable implements Comparable<Car>{
    @Override
    public int compareTo(Car o) {
        return o.getMoc() - Car.FERRARI.getMoc();
    }
}
