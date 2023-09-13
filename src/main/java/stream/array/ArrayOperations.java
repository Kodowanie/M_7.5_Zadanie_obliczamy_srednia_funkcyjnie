package stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

     //???
    /* static int []getAverage (int numbers){
          return new int[]{numbers};
     }*/

     static double getAverage(int[] numbers){

              IntStream.range(0,numbers.length)
                       .map(n -> numbers[n])
                       .forEach(System.out::println);

               double average = IntStream.range(0, numbers.length)
                       .map(n -> numbers[n])
                       .average()
                       .orElse(0);

          return average;
     }



}
