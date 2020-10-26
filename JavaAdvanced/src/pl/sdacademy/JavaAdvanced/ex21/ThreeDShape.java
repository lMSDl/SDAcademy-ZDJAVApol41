package pl.sdacademy.JavaAdvanced.ex21;

import pl.sdacademy.JavaAdvanced.ex20.Shape;
import pl.sdacademy.JavaAdvanced.ex22.Fillable;

public abstract class ThreeDShape extends Shape implements Fillable {
    abstract double calculateVolume();
}
