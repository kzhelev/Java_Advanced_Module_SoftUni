package SetsAndMaps;

import java.text.DecimalFormat;
import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputsNumber = Integer.parseInt(scanner.nextLine());
        String name;
        double[] grades;
        double avg;
        double sum = 0;

        Map<String, Double> students = new TreeMap<>();

        for (int i = 0; i < inputsNumber; i++) {
            name = scanner.nextLine();
            grades = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
            for (int j = 0; j < grades.length; j++) {
                sum += grades[j];
            }

            avg = sum/grades.length;
            students.put(name,avg);

            sum = 0;
        }

        DecimalFormat decimalFormat = new DecimalFormat("##.#############################");
        for (Map.Entry<String, Double> stringDoubleEntry : students.entrySet()) {
            System.out.printf("%s is graduated with %s%n",stringDoubleEntry.getKey(),decimalFormat.format(stringDoubleEntry.getValue()));
        }
    }
}
