package pl.sdacademy.JavaAdvanced;

import java.util.List;
import java.util.TreeMap;

public class Exercise6 {

    public void execute() {
        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("A", "1");
        map.put("C", "3");
        map.put("B", "2");

        printFirstLast(map);
    }

    public void printFirstLast(TreeMap<String, String> map) {
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());
    }
}
