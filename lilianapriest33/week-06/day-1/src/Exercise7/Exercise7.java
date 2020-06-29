package Exercise7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {

    public static void main(String[] args) {

        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        List<String> strings = cities.stream()
                .filter(n -> n.startsWith("N"))
                .collect(Collectors.toList());

        System.out.println(strings);
    }
}
