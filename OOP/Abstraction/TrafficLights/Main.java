package Abstraction.TrafficLights;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        Signal[] signalArr = Arrays.stream(input).map(Signal::parse).toArray(Signal[]::new);
        int loops = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < loops; i++) {
            Arrays.stream(signalArr).map(Signal::nextSignal).forEach(e -> System.out.print(e+" "));
            signalArr = Arrays.stream(signalArr).map(Signal::nextSignal).toArray(Signal[]::new);
            System.out.println();
        }
    }
}
