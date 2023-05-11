package StreamsFilesAndDirectoriesExercises;

import java.io.*;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {

        String path = "src/StreamsFilesAndDirectoriesExercises/Resources/input.txt";
        String pathNew = "src/StreamsFilesAndDirectoriesExercises/Resources/inputCount.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        FileOutputStream fileOutputStream = new FileOutputStream(pathNew);

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        FileWriter fileWriter = new FileWriter(pathNew);

        int charAsAscii = bufferedInputStream.read();

        int vowelsCount = 0;
        int otherSymbolsCount = 0;
        int punctuationCount = 0;

        while (charAsAscii >= 0) {
            if (charAsAscii != 97 && charAsAscii != 101 && charAsAscii != 105 && charAsAscii != 111 && charAsAscii != 117) {

            } else {
                vowelsCount++;
            }

            if (charAsAscii == 33 || charAsAscii == 44 || charAsAscii == 46 || charAsAscii == 63) {
                punctuationCount++;
            }

            if (charAsAscii != 97 && charAsAscii != 101 && charAsAscii != 105 && charAsAscii != 111 && charAsAscii != 117
            && charAsAscii != 33 && charAsAscii != 44 && charAsAscii != 46 && charAsAscii != 63 && charAsAscii > 32) {
                otherSymbolsCount++;
            }

            charAsAscii = bufferedInputStream.read();
        }

        fileWriter.write("Vowels: "+String.valueOf(vowelsCount) + "\n");
        fileWriter.write("Other symbols: "+String.valueOf(otherSymbolsCount) + "\n");
        fileWriter.write("Punctuation: "+String.valueOf(punctuationCount) + "\n");


        fileWriter.close();
        fileInputStream.close();
        fileOutputStream.close();

    }
}
