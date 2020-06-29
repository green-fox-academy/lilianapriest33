package Exercise1;

import java.util.Arrays;
import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        /*
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 ==0) {
                System.out.println(numbers.get(i));
            }
        }*/
        numbers.stream()
                .filter(x -> x % 2 ==0)
                .forEach(System.out::println);
    }
}

//Write a Stream Expression to get the even numbers from the list