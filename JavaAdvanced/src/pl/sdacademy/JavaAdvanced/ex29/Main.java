package pl.sdacademy.JavaAdvanced.ex29;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(partOf(list, (a) -> a>5));
    }
    public static <K> double partOf (Collection <K> collection, Function <K, Boolean> function){
       var variable = collection.stream().filter(function::apply).count();
       return (double)variable/collection.size()*100;
    }

}
