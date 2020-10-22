package pl.sdacademy.JavaAdvanced.ex19;

import pl.sdacademy.JavaAdvanced.ex18.Computer;

import java.util.Objects;

public class Laptop extends Computer {
    private String bateria;

    public Laptop(String procesor, String ram, String kartaGrafiki, String firma, String model, String bateria) {
        super(procesor, ram, kartaGrafiki, firma, model);
        this.bateria = bateria;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        String toString2 = super.toString();
        return toString2.substring(0, toString2.length() - 1) + ", bateria='" + bateria + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(bateria, laptop.bateria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bateria);
    }
}
