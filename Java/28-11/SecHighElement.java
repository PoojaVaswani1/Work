package Streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecHighElement {
    public static void main(String[] args) {
        int [] elements = {11,17,27,12,43,17,20,36};
        
       int seconHighest = Arrays.stream(elements).boxed()       // boxed here is java concept , it converts primitive data to wrapper class (int -> Integer)..
        .sorted(Comparator.reverseOrder()).skip(1)  // tell till which point u want to skip..
        .findFirst().get();   // findfirst - will give the first in the array or  list

       // List<String> list = Arrays.asList;
    }
}