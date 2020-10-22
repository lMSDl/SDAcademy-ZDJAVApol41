package pl.sdacademy.JavaAdvanced.ex18;

import java.util.Objects;

public class Computer {
    private String procesor;
    private String ram;
    private String kartaGrafiki;
    private String firma;
    private String model;

    public Computer(String procesor, String ram, String kartaGrafiki, String firma, String model) {
        this.procesor = procesor;
        this.ram = ram;
        this.kartaGrafiki = kartaGrafiki;
        this.firma = firma;
        this.model = model;
    }

    public String getProcesor() {
        return procesor;
    }

    public Computer setProcesor(String procesor) {
        this.procesor = procesor;
        return this;
    }

    public String getRam() {
        return ram;
    }

    public Computer setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public String getKartaGrafiki() {
        return kartaGrafiki;
    }

    public Computer setKartaGrafiki(String kartaGrafiki) {
        this.kartaGrafiki = kartaGrafiki;
        return this;
    }

    public String getFirma() {
        return firma;
    }

    public Computer setFirma(String firma) {
        this.firma = firma;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Computer setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "procesor='" + procesor + '\'' +
                ", ram='" + ram + '\'' +
                ", kartaGrafiki='" + kartaGrafiki + '\'' +
                ", firma='" + firma + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(procesor, computer.procesor) &&
                Objects.equals(ram, computer.ram) &&
                Objects.equals(kartaGrafiki, computer.kartaGrafiki) &&
                Objects.equals(firma, computer.firma) &&
                Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(procesor, ram, kartaGrafiki, firma, model);
    }
}
