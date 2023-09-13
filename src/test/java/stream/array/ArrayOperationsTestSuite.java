package stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){
        //Given
        int numbers [] = {2,2,2};

        //When
        Double average = ArrayOperations.getAverage(numbers);
        System.out.println(average);

        //Then
        Assertions.assertEquals(2.0,average);

    }

}
