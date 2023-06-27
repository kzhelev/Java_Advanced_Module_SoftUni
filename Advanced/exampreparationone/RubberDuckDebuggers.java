package exampreparationone;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RubberDuckDebuggers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String rowOne = scanner.nextLine();
        String rowTwo = scanner.nextLine();

        List<Integer> timePerTask = Arrays.stream(rowOne.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> tasksNumber = Arrays.stream(rowTwo.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Collections.reverse(tasksNumber);

        int darthVaderDucky = 0;
        int thorDucky = 0;
        int bigBlueRubberDucky = 0;
        int smallYellowRubberDucky = 0;

        int timeNeeded = 0;

        for (int i = 0; i < timePerTask.size() ; i++) {

            int currentTaskNumber = tasksNumber.get(0);

            for (int j = 0; j < tasksNumber.size(); j++) {

                timeNeeded = timePerTask.get(j) * currentTaskNumber;

                boolean isDarthVaderDucky = timeNeeded > 0 && timeNeeded <= 60;
                boolean isThorDucky = timeNeeded >= 61 && timeNeeded <= 120;
                boolean isBigBlueRubberDucky = timeNeeded >= 121 && timeNeeded <= 180;
                boolean isSmallYellowRubberDucky = timeNeeded >= 181 && timeNeeded <= 240;

                if (isDarthVaderDucky) {
                    darthVaderDucky += 1;
                    actions(timePerTask, tasksNumber, i, j);
                    i = -1;
                    break;
                } else if (isThorDucky) {
                    thorDucky += 1;
                    actions(timePerTask, tasksNumber, i, j);
                    i = -1;
                    break;
                } else if (isBigBlueRubberDucky) {
                    bigBlueRubberDucky += 1;
                    actions(timePerTask, tasksNumber, i, j);
                    i = -1;
                    break;
                } else if (isSmallYellowRubberDucky) {
                    smallYellowRubberDucky += 1;
                    actions(timePerTask, tasksNumber, i, j);
                    i = -1;
                    break;
                } else {
                    currentTaskNumber -= 2;

                    if (j == tasksNumber.size()-1) {
                        j = -1;
                    }
                }
            }
        }

        System.out.println("Congratulations, all tasks have been completed! Rubber ducks rewarded:");
        System.out.printf("Darth Vader Ducky: %d\nThor Ducky: %d\nBig Blue Rubber Ducky: %d\nSmall Yellow Rubber Ducky: %d\n"
        , darthVaderDucky, thorDucky, bigBlueRubberDucky, smallYellowRubberDucky);

    }

    private static void actions(List<Integer> timePerTask, List<Integer> tasksNumber, int i, int j) {
        timePerTask.remove(j);
        tasksNumber.remove(i);
    }
}
