package DefiningClasses.CarInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Car> carList = new ArrayList<>();

        int numberOfCars = Integer.parseInt(scanner.nextLine());
        String[] carInfoInput = scanner.nextLine().split("\\s+");

        for (int i = 0; i < numberOfCars; i++) {
            carList.add(new Car());
            carList.get(i).setBrand(carInfoInput[0]);
            carList.get(i).setModel(carInfoInput[1]);
            carList.get(i).setHorsePower(Integer.parseInt(carInfoInput[2]));
            carInfoInput = scanner.nextLine().split("\\s+");
        }

        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i).carInfo());
        }
    }
}
