package StreamsFilesAndDirectories;

import java.io.*;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WriteToFile {
    public static void main(String[] args) {

        String path = "src/StreamsFilesAndDirectories/Resources/input.txt";
        String pathNew = "src/StreamsFilesAndDirectories/Resources/inputWithoutPunctuation.txt";

        try {
            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(path));

            Set<Character> punctuationSymbols = Stream.of(',','.','!','?').collect(Collectors.toSet());

            int charCode = inputStream.read();

            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(pathNew));

            while (charCode >= 0) {
                if (!punctuationSymbols.contains((char) charCode)) {
                    outputStream.write((char) charCode);
                }
                charCode = inputStream.read();
            }

            inputStream.close();
            outputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
