package SetsAndMaps;

import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> students = new TreeMap<>();

        int studentsNumber = Integer.parseInt(scanner.nextLine());
        String[] input;

        for (int i = 0; i < studentsNumber; i++) {
            input = scanner.nextLine().split(" ");
            if (!students.containsKey(input[0])) {
                students.put(input[0], new ArrayList<>());
                students.get(input[0]).add(Double.parseDouble(input[1]));
            } else {
                students.get(input[0]).add(Double.parseDouble(input[1]));
            }
        }
        double sum = 0;
        double avg = 0;

        for (Map.Entry<String, List<Double>> stringListEntry : students.entrySet()) {

            System.out.print(stringListEntry.getKey()+" -> ");
            for (int i = 0; i < students.get(stringListEntry.getKey()).size(); i++) {
                System.out.printf("%.2f ",students.get(stringListEntry.getKey()).get(i));
                sum += students.get(stringListEntry.getKey()).get(i);
            }
            System.out.printf("(avg: %.2f)\n", avg = sum/students.get(stringListEntry.getKey()).size());
            avg = 0;
            sum = 0;
        }


    }
}
