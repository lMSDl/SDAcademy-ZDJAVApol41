package pl.sdacademy.JavaAdvanced.ex27;

import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

public class Joiner<T> {
    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(Collection<T> name) {
        return name.stream().map(Object::toString).collect(Collectors.joining(separator));
    }

    public String joinReduce(Collection<T> name) {
        return name.stream()
                .map(Objects::toString)
                .reduce("", (a, b) -> a + separator + b);
    }
}
