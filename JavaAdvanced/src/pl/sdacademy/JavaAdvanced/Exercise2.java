package pl.sdacademy.JavaAdvanced;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 extends Exercise1 {

    @Override
    public List<String> sortBackwards(List<String> strings) {
        //return strings.stream().sorted(new StringCoparator()).collect(Collectors.toList());
        return strings.stream().sorted((a,b) -> -a.compareToIgnoreCase(b)).collect(Collectors.toList());
    }

    public class StringCoparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return -o1.compareToIgnoreCase(o2);
        }
    }
}
