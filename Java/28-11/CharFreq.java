package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFreq {
    public static void main(String[] args) {
        
    
    String string = "poojavaswani";
        // converting it into string  array...
    // String[] input = string.split(" ");// arrray of char
    //  Arrays.toString(input);
      Map<String, Long> map =  Arrays.stream(string.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

    System.out.println(map);
}
}
