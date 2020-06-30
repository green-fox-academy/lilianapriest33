package Exercise10;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Fox> foxes = new ArrayList<>(Arrays.asList(
                new Fox("Roka1", "green", 2),
                new Fox("Roka2", "orange", 4),
                new Fox("Roka3", "green", 3),
                new Fox("Roka4", "purple", 8),
                new Fox("Roka5", "green", 5),
                new Fox("Roka6", "brown", 1)
        ));

        foxes.stream()
                .filter(f -> f.getColor().equals("green") && f.getAge() < 5)
                //.filter(f -> f.getAge() < 5)
                .forEach(f -> System.out.println(f.getName()));

        Map<Object, Long> FoxFrequency = foxes.stream()
                .collect(Collectors.groupingBy(fox -> fox.getColor(), Collectors.counting()));

        System.out.println(FoxFrequency);


    }
}