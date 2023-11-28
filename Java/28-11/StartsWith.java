package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWith {
    public static void main(String[] args) {
        
    
    List<Integer> list = Arrays.asList(11, 12 , 14, 82, 772,62);
    
    list.stream()
    .map(s -> s + "")
     .filter(s -> s.startsWith(s)).collect(Collectors.toList())
     .forEach(System.out::println);


     //string join example....
     String[] strings =  {"1","2","3"};
     String abc =String.join("-", strings); //1-2-3-4 it appends (adds)
     System.out.println(abc);
    
}
}
