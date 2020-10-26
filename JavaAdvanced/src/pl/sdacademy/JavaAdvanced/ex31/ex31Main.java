package pl.sdacademy.JavaAdvanced.ex31;

import java.io.*;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex31Main {
    public static void main(String[] args) {
        List<String> list = null;
        try {
            list = Files.readAllLines(Paths.get("src\\pl\\sdacademy\\JavaAdvanced\\ex31\\jakisplik"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("nie ma takiego pliku");
        }

        var listof = list.stream()
                .map(s -> s.split(" "))
                .flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(s -> s))
                .entrySet().stream().map(a -> a.getKey() + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + a.getValue().size())
                .collect(Collectors.joining("\n"));

        try {
            Files.writeString(Paths.get("ex31"), listof, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Blad");
        }
    }


}
