package StreamsFilesAndDirectoriesExercises;

import java.io.*;
import java.util.Scanner;

public class LineNumbers {
    public static void main(String[] args) throws IOException {
        String path = "src/StreamsFilesAndDirectoriesExercises/Resources/inputLineNumbers.txt";
        String pathNew = "src/StreamsFilesAndDirectoriesExercises/Resources/inputLineNumbersNumbered.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        Scanner scanner = new Scanner(bufferedInputStream);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathNew));

        int lineCounter = 1;
        while (scanner.hasNextLine()) {

            bufferedWriter.write(lineCounter+". "+scanner.nextLine()+"\n");
            lineCounter++;
        }
        bufferedWriter.flush();
        scanner.close();
        fileInputStream.close();
    }
}
