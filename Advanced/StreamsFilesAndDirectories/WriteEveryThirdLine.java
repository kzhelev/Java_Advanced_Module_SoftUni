package StreamsFilesAndDirectories;

import java.io.*;
import java.util.Scanner;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        String path =  "src/StreamsFilesAndDirectories/Resources/input.txt";
        String pathNewFile =  "src/StreamsFilesAndDirectories/Resources/everyThirdLine.txt";

        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(path));

        Scanner scanner = new Scanner(inputStream);

        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(pathNewFile));

        PrintWriter writer = new PrintWriter(outputStream);

        String line = scanner.nextLine();

        int lineCounter = 1;

        while (scanner.hasNextLine()) {
            if (lineCounter % 3 == 0) {
                writer.write(line);
                writer.println();
                writer.flush();
            }
            lineCounter++;
            line = scanner.nextLine();
        }

        inputStream.close();
        outputStream.close();
        writer.close();
        scanner.close();
    }
}
