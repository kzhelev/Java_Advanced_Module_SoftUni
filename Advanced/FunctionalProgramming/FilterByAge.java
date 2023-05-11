package FunctionalProgramming;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> personNameAge = new LinkedHashMap<>();

        int peopleCount = Integer.parseInt(scanner.nextLine());
        String[] input;

        for (int i = 0; i < peopleCount; i++) {
            input = scanner.nextLine().split(", ");
            personNameAge.put(input[0],Integer.parseInt(input[1]));
        }

        Map<String,Integer> filteredMapOfPeople = mapFilter(personNameAge,scanner);

        printer(filteredMapOfPeople,scanner);


    }

    public static Map<String,Integer> mapFilter(Map<String,Integer> person, Scanner scanner) {

        String filter = scanner.nextLine();
        int ageFilter = Integer.parseInt(scanner.nextLine());

        Map<String,Integer> filteredMap = new LinkedHashMap<>();

        switch (filter){
            case "younger":
                person.entrySet().stream().filter(entry -> entry.getValue() <= ageFilter).forEach(e -> filteredMap.put(e.getKey(),e.getValue()));
                break;
            case "older":
                person.entrySet().stream().filter(entry -> entry.getValue() >= ageFilter).forEach(e -> filteredMap.put(e.getKey(),e.getValue()));
                break;
            default: throw new IllegalArgumentException("Unknown filter" + filter);
        }

        return filteredMap;
    }

    public static void printer(Map<String,Integer> filteredMap, Scanner scanner) {

        String printFormat = scanner.nextLine();

        switch (printFormat) {
            case "name":
                filteredMap.entrySet().forEach(e -> System.out.println(e.getKey()));
                break;
            case "age":
                filteredMap.entrySet().forEach(e -> System.out.println(e.getValue()));
                break;
            case "name age":
                filteredMap.entrySet().forEach(e -> System.out.println(e.getKey() + " - "+e.getValue()));
                break;
            default: throw new IllegalArgumentException("Unknown print format" + printFormat);

        }
    }
}
