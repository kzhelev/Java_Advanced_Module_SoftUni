package Generics.GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int objects = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < objects; i++) {
            Box<java.lang.Integer> box = new Box<>();
            System.out.println(box.toString(Integer.parseInt(scanner.nextLine())));
        }
    }
}
