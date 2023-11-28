package Streams;

import java.util.stream.IntStream;

public class SkipLimit {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10).skip(1) // will skip 1st 
        .limit(8) // will print +1 then the limit set here.. till - 9
        .forEach(System.out::println);
    }
}
