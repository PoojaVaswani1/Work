package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplUniqEle {
    public static void main(String[] args) {
        // duplicate values
        String string = "poojavaswanijsj"; //["p","o"...]

        List <String> duplicates =Arrays.stream(string.split(""))// if we put space in this split - "this" "is" aysa ayega
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(i -> i.getValue() > 1)
        .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(duplicates);
        //unique values
        //collectors.grouping - returns map..


        System.out.println("unique*******************************");
        List <String> uniqueValues =  Arrays.stream(string.split(""))
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        .entrySet().stream().filter(i -> i.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(uniqueValues);


        //first unique no
        //here using linked hashmap - because it preserves insertion order so 1 element will only print..
        System.out.println("First----unique*******************************");
         String uniqueValuesNo =  Arrays.stream(string.split(""))
        .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap :: new, Collectors.counting()))
        .entrySet().stream().filter(i -> i.getValue() == 1).findFirst().get().getKey();    // get-- give Map entry Set in return...
        System.out.println(uniqueValuesNo);


    }
}
