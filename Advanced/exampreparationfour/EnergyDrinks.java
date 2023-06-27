package exampreparationfour;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EnergyDrinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> caffeineMg = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        Collections.reverse(caffeineMg);
        List<Integer> energyDrinks = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());

        int totalCaffeine = 0;

        while (energyDrinks.size() > 0 && caffeineMg.size() > 0) {

            int caffeine = caffeineMg.get(0) * energyDrinks.get(0);

            if (totalCaffeine + caffeine <= 300) {
                totalCaffeine += caffeine;
                caffeineMg.remove(0);
                energyDrinks.remove(0);
            } else {
                if (totalCaffeine >= 30) {
                    totalCaffeine -= 30;
                } else {
                    totalCaffeine = 0;
                }
                caffeineMg.remove(0);
                energyDrinks.add(energyDrinks.get(0));
                energyDrinks.remove(0);
            }
        }

        if (energyDrinks.size() == 0) {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        } else {
            System.out.print("Drinks left: ");
            System.out.println(energyDrinks.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        }

        System.out.printf("Stamat is going to sleep with %d mg caffeine.",totalCaffeine);


    }
}
