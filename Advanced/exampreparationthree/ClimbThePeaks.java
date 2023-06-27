package exampreparationthree;

import java.util.*;
import java.util.stream.Collectors;

public class ClimbThePeaks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> foodPortions = Arrays.stream(scanner.nextLine().split(",\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> stamina = Arrays.stream(scanner.nextLine().split(",\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Collections.reverse(foodPortions);

        Map<String,Integer> peak = new LinkedHashMap<>();
        peak.put("Vihren", 80);
        peak.put("Kutelo", 90);
        peak.put("Banski Suhodol", 100);
        peak.put("Polezhan", 60);
        peak.put("Kamenitza", 70);

        List<String> peakName = new ArrayList<>(peak.keySet());

        Map<String,Integer> climbedPeaks = new LinkedHashMap<>();

        while (foodPortions.size() > 0 && stamina.size() > 0 && peak.size() != 0) {

            int dailyPortion = foodPortions.get(0) + stamina.get(0);

            if (dailyPortion >= peak.get(peakName.get(0))) {
                climbedPeaks.put(peakName.get(0), peak.get(peakName.get(0)));
                peak.remove(peakName.get(0));
                peakName.remove(0);
            }
            foodPortions.remove(0);
            stamina.remove(0);
        }

        if (peak.size() == 0) {
            System.out.println("Alex did it! He climbed all top five Pirin peaks in one week -> @FIVEinAWEEK");
        } else {
            System.out.println("Alex failed! He has to organize his journey better next time -> @PIRINWINS");
        }

        if (climbedPeaks.size() != 0) {
            System.out.println("Conquered peaks:");
            climbedPeaks.keySet().forEach(e -> System.out.println(e));
        }


    }
}
