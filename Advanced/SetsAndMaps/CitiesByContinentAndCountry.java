package SetsAndMaps;

import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputsCount = Integer.parseInt(scanner.nextLine());
        String[] inputContent;

        Map<String,Map<String, List<String>>> citiesMap = new LinkedHashMap<>();

        for (int i = 0; i < inputsCount; i++) {

            inputContent = scanner.nextLine().split("\\s+");

            if (!citiesMap.containsKey(inputContent[0])){
                citiesMap.put(inputContent[0],new LinkedHashMap<>());
                if (!citiesMap.get(inputContent[0]).containsKey(inputContent[1])) {
                    citiesMap.get(inputContent[0]).put(inputContent[1], new ArrayList<>());
                    citiesMap.get(inputContent[0]).get(inputContent[1]).add(inputContent[2]);
                } else {
                    citiesMap.get(inputContent[0]).get(inputContent[1]).add(inputContent[2]);
                }
            } else {
                if (!citiesMap.get(inputContent[0]).containsKey(inputContent[1])) {
                    citiesMap.get(inputContent[0]).put(inputContent[1], new ArrayList<>());
                    citiesMap.get(inputContent[0]).get(inputContent[1]).add(inputContent[2]);
                } else {
                    citiesMap.get(inputContent[0]).get(inputContent[1]).add(inputContent[2]);
                }
            }
        }

        for (Map.Entry<String, Map<String, List<String>>> stringMapEntry : citiesMap.entrySet()) {

            System.out.println(stringMapEntry.getKey()+":");

            for (Map.Entry<String, List<String>> stringListEntry : citiesMap.get(stringMapEntry.getKey()).entrySet()) {
                System.out.print(stringListEntry.getKey()+" -> ");
                for (int i = 0; i < citiesMap.get(stringMapEntry.getKey()).get(stringListEntry.getKey()).size(); i++) {
                    System.out.print(
                            i != citiesMap.get(stringMapEntry.getKey()).get(stringListEntry.getKey()).size()-1 ?
                                    citiesMap.get(stringMapEntry.getKey()).get(stringListEntry.getKey()).get(i)+", " :
                                    citiesMap.get(stringMapEntry.getKey()).get(stringListEntry.getKey()).get(i)+"\n"
                    );
                }
            }


        }
    }
}
