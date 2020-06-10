package Anagram;

import java.util.Arrays;

public class Anagram {

    public static boolean areAnagram (char[] dog, char[] god) {

        int length1 = dog.length;
        int length2 = god.length;

        if (length1 != length2)
            return false;

        Arrays.sort(dog);
        Arrays.sort(god);

        for (int i = 0; i < length1; i++)
            if (dog[i] != god[i])
                return false;

        return true;
    }

    public static void main(String args[]) {

        char dog[] = { 'd', 'o', 'g' };
        char god[] = { 'g', 'o', 'd' };

        if (areAnagram(dog, god))
            System.out.println("The two strings are anagram of each other");
        else
            System.out.println("The two strings are not anagram of each other");
    }
}
