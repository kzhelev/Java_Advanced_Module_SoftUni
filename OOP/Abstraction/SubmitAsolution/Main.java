package Abstraction.SubmitAsolution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentSystem studentSystem = new StudentSystem();

        String[] input = scanner.nextLine().split(" ");

        while (!input[0].equals("Exit")) {

            switch (input[0]) {
                case "Create":
                    studentSystem.create(input);
                    break;
                case "Show":
                    studentSystem.show(input);
                    break;
            }
            input = scanner.nextLine().split(" ");
        }
    }
}
