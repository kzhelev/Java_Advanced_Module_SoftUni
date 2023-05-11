package StreamsFilesAndDirectories;

import java.io.*;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        String path =  "src/StreamsFilesAndDirectories/Resources/input.txt";
        String pathNewFile =  "src/StreamsFilesAndDirectories/Resources/inputInAscii.txt";

        FileInputStream inputStream = new FileInputStream(path);

        FileOutputStream outputStream = new FileOutputStream(pathNewFile);

        Set<Integer> charsAsciiCode = Stream.of(10,32).collect(Collectors.toSet());

        int charAscii = inputStream.read();
        String input = String.valueOf(charAscii);

        while (charAscii >= 0) {

            if (!charsAsciiCode.contains(charAscii)) {
                System.out.print(charAscii);
                for (int i = 0; i < input.length(); i++) {
                    outputStream.write(input.charAt(i));
                }
            } else if (charAscii == 10) {
                System.out.print((char) 10);
                outputStream.write((char) 10);
            } else if (charAscii == 32) {
                System.out.print((char) 32);
                outputStream.write((char) 32);
            }

            charAscii = inputStream.read();
            input = String.valueOf(charAscii);

        }

        inputStream.close();
        outputStream.close();
    }
}
