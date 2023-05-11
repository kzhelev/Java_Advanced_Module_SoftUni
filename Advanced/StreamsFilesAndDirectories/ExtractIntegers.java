package StreamsFilesAndDirectories;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExtractIntegers {
    public static void main(String[] args) throws IOException {
        String path =  "src/StreamsFilesAndDirectories/Resources/input.txt";
        String pathNewFile =  "src/StreamsFilesAndDirectories/Resources/inputInAscii.txt";

        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(path));

        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(pathNewFile));

        Set<Integer> digitsInAscii = Stream.of(48,49,50,51,52,53,53,54,55,56,57).collect(Collectors.toSet());

        List<String> stringList = new ArrayList<>();
        stringList.add("");

        int charInAscii = inputStream.read();

        while (charInAscii >= 0) {

            if (charInAscii == ' ' || charInAscii == 10 ) {
                if (stringList.get(stringList.size()-1).length() != 0) {
                    stringList.add("");
                }
            } else if (!digitsInAscii.contains(charInAscii) && !stringList.isEmpty()) {
                if (stringList.get(stringList.size()-1).length() != 0) {
                    stringList.set(stringList.size()-1, "");
                }
            } else if (digitsInAscii.contains(charInAscii)) {
                stringList.set(stringList.size()-1, stringList.get(stringList.size()-1)+String.valueOf((char) charInAscii));
            }

            charInAscii = inputStream.read();
        }

        for (int i = 0; i < stringList.size()-1; i++) {
            for (int j = 0; j < stringList.get(i).length(); j++) {
            outputStream.write(stringList.get(i).charAt(j));
            }
            outputStream.write(10);
        }

        outputStream.close();
        inputStream.close();

    }
}
