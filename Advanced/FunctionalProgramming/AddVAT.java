package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] prices = Arrays.stream(scanner.nextLine().split(", ")).mapToDouble(Double::parseDouble).toArray();

        UnaryOperator<Double> unaryOperator = e -> e*1.2;

        System.out.println("Prices with VAT:");
        Arrays.stream(prices).map(unaryOperator::apply).forEach(e -> System.out.printf("%.2f\n",e));
    }
}
