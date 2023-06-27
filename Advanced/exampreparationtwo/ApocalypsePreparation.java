package exampreparationtwo;

import java.util.*;
import java.util.stream.Collectors;

public class ApocalypsePreparation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> textile = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> medicament = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Collections.reverse(medicament);

        Map<String, Integer> items = new TreeMap<>();

        int patch = 0;
        int bandage = 0;
        int medKit = 0;

        int counter = 0;

        while (textile.size() != 0 && medicament.size() != 0) {

            int sum = textile.get(counter) + medicament.get(counter);

            if (sum == 30) {
                addItem("Patch",items);
                textile.remove(counter);
                medicament.remove(counter);
            } else if (sum == 40) {
                addItem("Bandage",items);
                textile.remove(counter);
                medicament.remove(counter);
            } else if (sum == 100) {
                addItem("MedKit",items);
                textile.remove(counter);
                medicament.remove(counter);
            } else if (sum > 100) {
                addItem("MedKit",items);
                medicament.set(counter+1,medicament.get(counter+1)+(sum-100));
                textile.remove(counter);
                medicament.remove(counter);
            } else {
                textile.remove(counter);
                medicament.set(counter,medicament.get(counter)+10);
            }
        }

        if (textile.size() == 0 && medicament.size() == 0) {
            System.out.println("Textiles and medicaments are both empty.");
        } else if (textile.size() == 0) {
            System.out.println("Textiles are empty.");
        } else if (medicament.size() == 0) {
            System.out.println("Medicaments are empty.");
        }

        items.entrySet().stream().sorted(Map.Entry.comparingByValue((e1,e2) -> e2 - e1))
                .forEach(entry -> System.out.printf("%s - %d\n",entry.getKey(),entry.getValue()));


        if (medicament.size() != 0) {
            System.out.print("Medicaments left: ");
            System.out.println(medicament.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        }

        if (textile.size() != 0) {
            System.out.print("Textiles left: ");
            System.out.println(textile.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        }

    }

    public static void addItem(String item, Map<String, Integer> items) {
        if (!items.containsKey(item)) {
            items.put(item,1);
        } else {
            items.put(item, items.get(item)+1);
        }
    }
}
