package Exercise4;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Exercise4 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        OptionalDouble avg = numbers.stream()
                .filter(x -> x % 2 !=0)
                .mapToDouble(x -> x)
                .average();

        System.out.println(avg);
    }
}
//Write a Stream Expression to get the average value of the odd numbers from the list
