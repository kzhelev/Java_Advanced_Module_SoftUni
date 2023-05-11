package MultidimensionalArrays.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(command);
        matcher.find();

        int degrees = Integer.parseInt(matcher.group());
        while (degrees > 360) {
            degrees -= 360;
        }

        String input = scanner.nextLine();

        List<String> matrixElements =  new ArrayList<>();

        while (!input.equals("END")) {
            matrixElements.add(input);
            input = scanner.nextLine();
        }

        int longestString = 0;

        for (String matrixElement : matrixElements) {
            if (matrixElement.length() > longestString) {
                longestString = matrixElement.length();
            }
        }

        int spacesToAdd = 0;

        for (int i = 0; i < matrixElements.size() ; i++) {
            spacesToAdd = longestString - matrixElements.get(i).length();
            for (int j = 0; j < spacesToAdd; j++) {
                matrixElements.set(i, matrixElements.get(i)+" ");
            }
        }

        char[][] charArray0 = new char[matrixElements.size()][longestString];
        for (int i = 0; i < charArray0.length; i++) {
            charArray0[i] = matrixElements.get(i).toCharArray();
        }

        char[][] charArray270 = new char[longestString][matrixElements.size()];
        int counter270 = charArray270.length-1;
        for (int i = 0; i < charArray270.length; i++) {
            for (int j = 0; j < charArray270[i].length; j++) {
                charArray270[i][j] = charArray0[j][counter270];
            }
            counter270--;
        }

        char[][] charArray90 = new char[longestString][matrixElements.size()];
        int counter90 = 0;
        for (int i = 0; i < charArray90.length; i++) {
            for (int j = charArray90[i].length-1; j >= 0 ; j--) {
                charArray90[i][counter90] = charArray0[j][i];
                counter90++;
            }
            counter90 = 0;
        }

        char[][] charArray180 = new char[matrixElements.size()][longestString];
        int counter180r = 0;
        int counter180c = 0;
        for (int i = charArray180.length - 1; i >= 0; i--) {
            for (int j = charArray180[i].length-1; j >= 0 ; j--) {
                charArray180[i][j] = charArray0[counter180r][counter180c];
                counter180c++;
            }
            counter180c = 0;
            counter180r++;
        }

        if (command.substring(0,6).equals("Rotate")) {

            switch (degrees) {

                case 90:
                    printArr(charArray90);
                    break;
                case 180:
                    printArr(charArray180);
                    break;
                case 270:
                    printArr(charArray270);
                    break;
                case 360:
                    printArr(charArray0);
                    break;
            }
        }
    }

    public static void printArr(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(j == array[i].length-1 ? array[i][j]+" " : array[i][j]);
            }
            System.out.println();
        }
    }
}
