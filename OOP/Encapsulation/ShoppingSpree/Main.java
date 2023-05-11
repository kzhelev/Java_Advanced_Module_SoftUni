package Encapsulation.ShoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] personInfo = getObjectInfo(scanner);

        Map<String, Person> peopleList = new LinkedHashMap<>();

        fillUpPeopleList(personInfo, peopleList);

        String[][] productInfo = getObjectInfo(scanner);

        Map<String, Product> productList = new LinkedHashMap<>();

        fillUpProductList(personInfo, productInfo, productList);

        buyProducts(scanner, peopleList, productList);

        for (var person : peopleList.values()) {
            System.out.println(person.toString());
        }

    }

    private static void buyProducts(Scanner scanner, Map<String, Person> peopleList, Map<String, Product> productList) {
        String input = scanner.nextLine();

        while (!input.equals("END")) {

            String[] action = input.split("\\s+");
            String personName = action[0];
            String productName = action[1];
            try {
                peopleList.get(personName).buyProduct(productList.get(productName));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }


            input = scanner.nextLine();
        }
    }

    private static void fillUpPeopleList(String[][] personInfo, Map<String, Person> peopleList) {
        for (int i = 0; i < personInfo.length; i++) {

            try {
                String name = personInfo[i][0];
                double money = Double.parseDouble(personInfo[i][1]);

                peopleList.put(name, new Person(name,money));

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.exit(0);
            }
        }
    }

    private static void fillUpProductList(String[][] personInfo, String[][] productInfo, Map<String, Product> productList) {
        for (int i = 0; i < personInfo.length; i++) {

            try {
                String name = productInfo[i][0];
                double cost = Double.parseDouble(productInfo[i][1]);

                productList.put(name, new Product(name,cost));

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.exit(0);
            }
        }
    }

    private static String[][] getObjectInfo(Scanner scanner) {
        String[] input = scanner.nextLine().split(";");

        String[][] objectInfo = new String[input.length][];

        for (int i = 0; i < input.length; i++) {
            objectInfo[i] = input[i].split("=");
        }
        return objectInfo;
    }
}
