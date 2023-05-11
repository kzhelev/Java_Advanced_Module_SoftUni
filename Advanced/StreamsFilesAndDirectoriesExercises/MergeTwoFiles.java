package StreamsFilesAndDirectoriesExercises;

import java.io.*;
import java.util.Scanner;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        String pathOne = "src/StreamsFilesAndDirectoriesExercises/Resources/inputOne.txt";
        String pathTwo = "src/StreamsFilesAndDirectoriesExercises/Resources/inputTwo.txt";
        String newFile = "src/StreamsFilesAndDirectoriesExercises/Resources/mergedText.txt";

        BufferedInputStream inputOne = new BufferedInputStream(new FileInputStream(pathOne));

        BufferedInputStream inputTwo = new BufferedInputStream(new FileInputStream(pathTwo));

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(newFile));

        Scanner scanner = new Scanner(inputOne);

        FileWriter fileWriter = new FileWriter(newFile);

        while (scanner.hasNextLine()) {
            fileWriter.append(scanner.nextLine() + "\n");
        }

        scanner = new Scanner(inputTwo);

        while (scanner.hasNextLine()) {
            fileWriter.append(scanner.nextLine() + "\n");
        }

        fileWriter.flush();
    }
}
