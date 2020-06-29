package Exercise2;

import java.util.Arrays;
import java.util.List;

public class Exercise2 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);

        numbers.stream()
                .filter(x -> x > 0)
                .map((Integer x) -> (int) Math.pow(x, 2))
                .forEach(System.out::println);
    }
}
//Write a Stream Expression to get the squared value of the positive numbers from the list