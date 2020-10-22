package pl.sdacademy.JavaAdvanced.ex23;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Zoo {
    List<String> zwierzeta = new ArrayList<>();

    public Zoo() {
        Random random =  new Random();
        for (int i = 0, limit = random.nextInt(10); i < limit; i++){
            zwierzeta.add("Slon");
        }
        random = new Random(zwierzeta.size());
        for (int i = 0, limit = random.nextInt(10); i < limit; i++){
            zwierzeta.add("tygrys");
        }
        random = new Random(zwierzeta.size());

        for (int i = 0, limit = random.nextInt(10); i < limit; i++){
            zwierzeta.add("zyrafa");
        }
        random = new Random(zwierzeta.size());

        for (int i = 0, limit = random.nextInt(10); i < limit; i++){
            zwierzeta.add("pingwin");
        }
    }

    public int getNumberOfAllAnimals(){
        return zwierzeta.size();
    }

    public Map<String, Integer> getAnimalsCount(){
        return zwierzeta.stream().collect(Collectors.groupingBy(a -> a)).entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,a -> a.getValue().size()));
    }

    public Map<String, Integer> getAnimalsCountSorted() {
        return getAnimalsCount().entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(a, b) -> a, LinkedHashMap::new));
    }
}
