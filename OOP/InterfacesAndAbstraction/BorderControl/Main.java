package InterfacesAndAbstraction.BorderControl;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<Citizen> citizens = new HashSet<>();

        Set<Robot> robots = new HashSet<>();

        while (!input.equals("End")) {

            String[] info = input.split("\\s+");

            String id;

            switch (info.length) {
                case 2:
                    String model = info[0];
                    id = info[1];
                    robots.add(new Robot(model,id));
                    break;
                case 3:
                    String name = info[0];
                    int age = Integer.parseInt(info[1]);
                    id = info[2];
                    citizens.add(new Citizen(name,age,id));
                    break;
            }

            input = scanner.nextLine();
        }

        String endOfFakeIds = scanner.nextLine();

        robots.stream().filter(e -> e.getId().endsWith(endOfFakeIds)).forEach(e -> System.out.println(e.getId()));

        citizens.stream().filter(e -> e.getId().endsWith(endOfFakeIds)).forEach(e -> System.out.println(e.getId()));



    }
}
