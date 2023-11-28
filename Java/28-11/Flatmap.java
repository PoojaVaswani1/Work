import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flatmap{
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("pooja","richa","kartik","aman");

        List<String> list2 = Arrays.asList("pooja2","richa2","kartik2","aman2");

        System.out.println("concat***************************");

       Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList()).forEach(System.out::println);
      // Stream<Object> list = Stream.of(null)
       System.out.println("Flatmap***************************");

       Stream.of(list1, list2)
       .flatMap(list -> list.stream())// make the list into stream of stream values...
       .collect(Collectors.toList()).forEach(System.out::println);

       
        
    }
} 