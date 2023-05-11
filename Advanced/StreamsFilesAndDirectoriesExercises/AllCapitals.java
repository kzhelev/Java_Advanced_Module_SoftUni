package StreamsFilesAndDirectoriesExercises;

import java.io.*;

public class AllCapitals {
    public static void main(String[] args) throws IOException {

        String path = "StreamsFilesAndDirectoriesExercises/Resources/text.txt";
        String pathNew = "StreamsFilesAndDirectoriesExercises/Resources/inputCapital.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        FileOutputStream fileOutputStream = new FileOutputStream(pathNew);

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        int charAsAscii = bufferedInputStream.read();

        while (charAsAscii >= 0) {
            if (charAsAscii >= 97 && charAsAscii <= 122) {
                bufferedOutputStream.write(charAsAscii - 32);
            } else {
                bufferedOutputStream.write(charAsAscii);
            }
            charAsAscii = bufferedInputStream.read();
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
        fileInputStream.close();
        fileOutputStream.close();

    }
}
