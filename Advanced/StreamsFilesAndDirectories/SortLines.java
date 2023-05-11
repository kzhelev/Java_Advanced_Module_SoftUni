package StreamsFilesAndDirectories;

import java.io.*;
import java.util.*;

public class SortLines {
    public static void main(String[] args) throws IOException {
        String path =  "src/StreamsFilesAndDirectories/Resources/input.txt";
        String pathNewFile =  "src/StreamsFilesAndDirectories/Resources/sortedLines.txt";

        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(path));

        Scanner scanner = new Scanner(inputStream);

        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(pathNewFile));

        PrintWriter printWriter = new PrintWriter(outputStream);

        PrintWriter writer = new PrintWriter(outputStream);

        Set<String> sortedLines = new TreeSet<>();

        while (scanner.hasNextLine()) {
            sortedLines.add(scanner.nextLine());
        }

        for (String sortedLine : sortedLines) {
            printWriter.write(sortedLine);
            printWriter.println();
        }

        printWriter.flush();
        printWriter.close();
        inputStream.close();
        outputStream.close();

    }
}
