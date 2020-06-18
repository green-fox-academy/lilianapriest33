package MostCommonCharacters;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.*;

class MostCommonCharacters {
    public static void main(String[] args) {

        String filename = "../src/textfile.txt";
        char array[] = filename.toCharArray();
        int size = array.length;

        try {
            Path filePath = Paths.get("src/textfile.txt");
            List<String> lines = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("The file does not exist.");
            System.exit(2);
        }

        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        while (i != size) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else {
                int oldValue = map.get(array[i]);
                int newValue = oldValue + 1;
                map.put(array[i], newValue);
            }
            ++i;
        }
        Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
        char maxKey = ' ';
        int maxValue = 0;

        for (Map.Entry<Character, Integer> data : hmap) {
            if (data.getValue() > maxValue) {
                maxValue = data.getValue();
                maxKey = data.getKey();
            }
        }
        System.out.print("'" + maxKey + "': ");
        System.out.print(" " + maxValue);
    }
}