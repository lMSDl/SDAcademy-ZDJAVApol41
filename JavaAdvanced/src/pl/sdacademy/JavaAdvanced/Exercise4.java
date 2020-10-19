package pl.sdacademy.JavaAdvanced;

import java.util.Map;

public class Exercise4 {
    public void execute() {
        var storage = new Storage();
        storage.addToStorage("a", "A");
        storage.addToStorage("a", "B");

        storage.addToStorage("b", "B");
        storage.addToStorage("b", "C");

        storage.addToStorage("c", "A");
        storage.addToStorage("c", "C");

        storage.printValues("b");
        storage.findValues("A");
    }
}
