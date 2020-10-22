package pl.sdacademy.JavaAdvanced.ex14;

import java.util.*;
import java.util.stream.Collectors;

public class Array {

    private List<Integer> array;
    Random random = new Random();

    public Array() {
        array = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            array.add(i, random.nextInt(10000));
        }
    }

    public List<Integer> getUniqeValue() {
        List<Integer> localList = new ArrayList<>(array);
        List<Integer> UniqeValues = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < localList.size(); i++) {
            if (map.containsKey(localList.get(i))) {
                int currentNumber = map.get(localList.get(i));
                map.put(localList.get(i), currentNumber + 1);
            } else {
                map.put(localList.get(i), 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                UniqeValues.add(entry.getKey());

            }
        }
        return UniqeValues;
    }

    public List<Integer> doubleInteger(){
        HashMap <Integer, Integer> newMap = getmap();
        List<Integer> newList = new ArrayList<>();
        for (Map.Entry <Integer, Integer> entry : newMap.entrySet()){
            if (entry.getValue()>=2){
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

    public List<Integer> get25MostCommon(){
        HashMap<Integer, Integer> map = getmap();
        List <Integer> newList = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).limit(25).map(x -> x.getKey()).collect(Collectors.toList());
        return newList;
    }
    
}


