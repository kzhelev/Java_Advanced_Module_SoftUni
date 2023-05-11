package SetsAndMaps.Exercises;

import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> chemicalElementsSet = new TreeSet<>();

        int linesOfUsedElements = Integer.parseInt(scanner.nextLine());
        
        String[] usedElements;

        for (int i = 0; i < linesOfUsedElements; i++) {
            usedElements = scanner.nextLine().split("\\s+");
            chemicalElementsSet.addAll(Arrays.asList(usedElements));
        }

        for (String s : chemicalElementsSet) {
            System.out.print(s+" ");
        }
    }
}
