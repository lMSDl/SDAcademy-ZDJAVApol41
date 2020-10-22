package pl.sdacademy.JavaAdvanced.ex14;

import java.security.KeyStore;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Array {

    private List<Integer> array;

    public Array() {
        generateByStream();
    }

    private  void generateByStream() {
        array = Stream.generate(() -> new Random().nextInt(1000)).limit(1000).collect(Collectors.toList());
    }

    private void generate() {
        Random random = new Random();
        array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(i, random.nextInt(10));
        }
    }


    public List<Integer> getUniqeValueByStream() {
        return getFilteredByStream(x -> x == 1);
    }
    public List<Integer> getDoubleIntegerByStream() {
        return getFilteredByStream(x -> x >= 2);
    }
    public List<Integer> getFilteredByStream(Function<Integer, Boolean> func) {
        return getMapByStream().entrySet().stream().filter(x -> func.apply(x.getValue())).map(x -> x.getKey()).collect(Collectors.toList());
    }

    public List<Integer> getUniqeValue() {
        return getFiltered(x -> x == 1);
    }

    public List<Integer> doubleInteger(){
        return getFiltered(x -> x >= 2);
    }

    private List<Integer> getFiltered(Function<Integer, Boolean> func){
        HashMap <Integer, Integer> newMap = getmap();
        List<Integer> newList = new ArrayList<>();
        for (Map.Entry <Integer, Integer> entry : newMap.entrySet()){
            if (func.apply(entry.getValue())){
                newList.add(entry.getKey());
            }
        }
        return newList;
    }


    public List<Integer> getArray() {
        return array;
    }

    public HashMap<Integer, Integer> getmap() {
        List<Integer> localList = new ArrayList<>(array);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < localList.size(); i++) {
            if (map.containsKey(localList.get(i))) {
                int currentNumber = map.get(localList.get(i));
                map.put(localList.get(i), currentNumber + 1);
            } else {
                map.put(localList.get(i), 1);
            }
        }
        return map;
    }

    public Map<Integer, Integer> getMapByStream() {
        return  array.stream().collect(Collectors.groupingBy(x -> x)).entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, x -> x.getValue().size()));
    }


    public List<Integer> get25MostCommon(){
        HashMap<Integer, Integer> map = getmap();
        List <Integer> newList = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(25).map(x -> x.getKey()).collect(Collectors.toList());
        return newList;
    }

    public  void deduplicate() {
        for (int i = 0; i < array.size(); i++) {
            var value = array.get(i);
            var duplicate = array.stream().filter(x -> x == value).count() > 1;
            if(duplicate) {
                array.set(i, new Random().nextInt(array.size()*10));
                i--;
            }
        }
    }
}


