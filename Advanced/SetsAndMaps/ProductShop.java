package SetsAndMaps;

import java.util.*;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",\\s+");
        Map<String,Map<String, Double>> shops = new TreeMap<>();

        while (!input[0].equals("Revision")) {

            if (!shops.containsKey(input[0])) {
                shops.put(input[0],new LinkedHashMap<>());
                shops.get(input[0]).put(input[1],Double.parseDouble(input[2]));
            } else {
                shops.get(input[0]).put(input[1],Double.parseDouble(input[2]));
            }

            input = scanner.nextLine().split(",\\s+");
        }

        for (Map.Entry<String, Map<String, Double>> stringMapEntry : shops.entrySet()) {

            System.out.println(stringMapEntry.getKey()+"->");
            for (Map.Entry<String, Double> stringDoubleEntry : shops.get(stringMapEntry.getKey()).entrySet()) {
                System.out.printf("Product: %s, Price: %.1f\n",stringDoubleEntry.getKey(),stringDoubleEntry.getValue());
            }
        }

    }
}
