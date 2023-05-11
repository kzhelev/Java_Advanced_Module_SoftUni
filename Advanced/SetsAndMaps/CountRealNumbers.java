package SetsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> numbersMap = new LinkedHashMap<>();

        List<Double>  numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numbersList.size(); i++) {
            if (!numbersMap.containsKey(numbersList.get(i))) {
                numbersMap.put(numbersList.get(i),1);
            } else {
                numbersMap.put(numbersList.get(i),numbersMap.get(numbersList.get(i))+1);
            }
        }

        for (Map.Entry<Double, Integer> stringIntegerEntry : numbersMap.entrySet()) {
            System.out.printf("%.1f -> %d%n",stringIntegerEntry.getKey(),stringIntegerEntry.getValue());
        }

    }
}
