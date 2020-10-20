package pl.sdacademy.JavaAdvanced;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    private Map<String, List<String>> map;

    public  Storage()  {
        this(new HashMap<>());
    }

    public  Storage(Map<String, List<String>> map)
    {
        this.map = map;
    }

    public void addToStorage(String key, String value)
    {
        if(map.containsKey(key)) {
            map.get(key).add(value);
        }
        else {
            map.put(key, new ArrayList<>(List.of(value)));
        }
    }

    public void printValues(String key) {
//        if(!map.containsKey(key))
//            return;
        var value = map.get(key);
        if(value == null) {
            return;
        }
        System.out.println(value);
    }

    public void findValues(String value)
    {
        for (var element : map.entrySet()) {
            if(element.getValue().contains(value))
                System.out.println(element.getKey());
        }

        map.entrySet().stream()
                .filter(element -> element.getValue().contains(value))
                .map(element -> element.getKey())
                .forEach(key -> System.out.println(key));
    }
}
