package pl.sdacademy.JavaAdvanced;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise1 {

    public void execute() {
        List<String> strings = List.of("a", "b", "c", "d", "A", "C");
        System.out.println(strings);
        strings = sortBackwards(strings);
        System.out.println(strings);
    }

    public List<String> sortBackwards(List<String> strings)
    {
        //strings = new ArrayList<>(strings);

        //strings.sort(String::compareTo);
        //strings.sort(Comparator.reverseOrder());

        //Collections.sort(strings, String::compareTo);
        //Collections.reverse(strings);
        //return strings;

        return strings.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}
