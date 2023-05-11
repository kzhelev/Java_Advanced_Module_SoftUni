package SetsAndMaps.Exercises;

import java.util.*;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> countMap = new TreeMap<>();
        char[] charArr = scanner.nextLine().toCharArray();

        for (char c : charArr) {
            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) + 1);
            } else {
                countMap.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : countMap.entrySet()) {
            System.out.printf("%s: %d time/s\n",characterIntegerEntry.getKey(),characterIntegerEntry.getValue());
        }


    }
}
