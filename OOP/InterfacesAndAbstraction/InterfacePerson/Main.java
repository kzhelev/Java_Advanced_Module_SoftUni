package InterfacesAndAbstraction.InterfacePerson;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String,Buyer> buyers = new HashMap();

        int people = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < people; i++) {

            String[] info = scanner.nextLine().split("\\s+");

            String name;
            String birthDate;
            int age;

            switch (info.length) {
                case 4:
                    name = info[0];
                    age = Integer.parseInt(info[1]);
                    String id = info[2];
                    birthDate = info[3];
                    buyers.put(name, new Citizen(name,age,id,birthDate));
                    break;
                case 3:
                    name = info[0];
                    age = Integer.parseInt(info[1]);
                    String group = info[2];

                    buyers.put(name, new Rebel(name,age,group));
                    break;
            }
        }

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String name = input;
            if (buyers.containsKey(name)) {
                buyers.get(name).buyFood();
            }

            input = scanner.nextLine();
        }

        System.out.println(buyers.values().stream().mapToInt(Buyer::getFood).sum());
    }
}
