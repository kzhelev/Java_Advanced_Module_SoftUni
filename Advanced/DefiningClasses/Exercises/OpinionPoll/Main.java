package DefiningClasses.Exercises.OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleNumber = Integer.parseInt(scanner.nextLine());

        String[] personInfo;

        List<Person> listOfPeople = new ArrayList<>();

        for (int i = 0; i < peopleNumber; i++) {
            personInfo = scanner.nextLine().split(" ");
            listOfPeople.add(new Person(personInfo[0],Integer.parseInt(personInfo[1])));
        }

        listOfPeople.stream().filter(e -> e.getAge() > 30).sorted(Comparator.comparing(Person::getName))
                .forEach(e -> System.out.printf("%s - %d%n",e.getName(),e.getAge()));
    }
}
