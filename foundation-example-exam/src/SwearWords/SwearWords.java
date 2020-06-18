package SwearWords;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

class Swear {
    public static void main(String[] args) {
        System.out.println(removeSwear("./src/content.txt"));
    }

    public static int removeSwear(String path) {
        HashMap<String, Integer> hashMap = new HashMap();
        
        ArrayList<String> swears = new ArrayList<>(Arrays.asList("fuck", "bloody", "cock", "shit",
                "fucker", "fuckstick", "asshole", "dick", "piss", "cunt", "jizz"));

        int wordCounter = 0;
        ArrayList<String> fileContent = new ArrayList<>();

        try {
            Path filePath = Paths.get(path);
            List<String> lines = Files.readAllLines(filePath);

            for (String line : lines) {
                List<String> words = Arrays.asList(line.split(" "));
                for (int i = 0; i < words.size(); i++) {
                    words.set(i, words.get(i).toLowerCase());
                }
                for (String swear : swears) {
                    line = line.replaceAll("(?i)" + swear, "");
                    wordCounter += Collections.frequency(words, swear);
                }
                fileContent.add(line);
            }
        } catch (IOException e) {
            System.out.println("File does not exist.");
            System.exit(2);
        }
        return wordCounter;
    }
}
