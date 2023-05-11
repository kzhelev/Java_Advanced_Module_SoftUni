package IteratorsAndComparators.ComparingObjects;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int loops = Integer.parseInt(input);

        Set<Person> nameComp = new TreeSet<>(new NameComparator());
        Set<Person> ageComp = new TreeSet<>(new AgeComparator());

        for (int i = 0; i < loops; i++) {

            input = scanner.nextLine();

            String[] personInfo = input.split("\\s+");

            nameComp.add(new Person(personInfo[0], Integer.parseInt(personInfo[1])));
            ageComp.add(new Person(personInfo[0], Integer.parseInt(personInfo[1])));
        }

        for (Person person : nameComp) {
            System.out.println(person);
        }

        for (Person person : ageComp) {
            System.out.println(person);
        }
    }
}
