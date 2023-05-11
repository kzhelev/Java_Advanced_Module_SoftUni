    package MultidimensionalArrays.Exercises;

    import java.util.Arrays;
    import java.util.Scanner;

    public class MatrixShuffling {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] rowsAndColumns = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int row = rowsAndColumns[0];
            int columns = rowsAndColumns[1];

            String[][] array = getArr(scanner,row,columns);
            String workArray;

            String[] command = scanner.nextLine().split(" ");

            while (!command[0].equals("END")) {
                if (command[0].equals("swap") && command.length == 5) {
                    if (Integer.parseInt(command[1]) >= row && Integer.parseInt(command[2]) >= columns
                            && Integer.parseInt(command[3]) >= row && Integer.parseInt(command[4]) >= columns) {
                        System.out.println("Invalid input!");
                    } else {
                        workArray = array[Integer.parseInt(command[1])][Integer.parseInt(command[2])];
                        array[Integer.parseInt(command[1])][Integer.parseInt(command[2])] =
                                array[Integer.parseInt(command[3])][Integer.parseInt(command[4])];
                        array[Integer.parseInt(command[3])][Integer.parseInt(command[4])] = workArray;
                        printArr(array);
                    }
                } else{
                        System.out.println("Invalid input!");
                }
                command = scanner.nextLine().split(" ");
            }
        }

        private static void printArr(String[][] array) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(j != array[i].length-1 ? array[i][j]+" " : array[i][j]);
                }
                System.out.println();
            }
        }

        private static String[][] getArr(Scanner scanner, int row, int colum) {
            String[][] intArr = new String[row][colum];
            for (int i = 0; i < row; i++) {
                intArr[i] = scanner.nextLine().split("\\s+");
            }
            return intArr;
        }
    }
