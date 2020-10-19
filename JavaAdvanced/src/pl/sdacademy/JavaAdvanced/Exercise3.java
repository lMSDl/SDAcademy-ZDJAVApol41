package pl.sdacademy.JavaAdvanced;

import java.util.Map;

public class Exercise3
{
    public void execute() {
        Map<String, Integer> map = Map.of("a", 1, "b", 2, "c", 3);
        print(map);

    }

    public void print(Map<String, Integer> map) {

//        if(a == 0)
//        {
//            b
//        }
//        else
//        {
//            c
//        }
//
//        a == 0 ? b : c

        var result = map.entrySet().stream()
                .map(element -> String.format("Klucz: %s, Wartość: %d", element.getKey(), element.getValue()))
                .reduce("", (output, next) -> output.isEmpty() ? next : String.format("%s,\n%s", output, next)) + ".";
        System.out.println(result);
    }
}
