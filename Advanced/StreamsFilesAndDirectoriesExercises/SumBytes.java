package StreamsFilesAndDirectoriesExercises;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) throws IOException {

        String path = "src/StreamsFilesAndDirectoriesExercises/Resources/input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        int charInAscii = bufferedInputStream.read();
        int sum = 0;

        while (charInAscii >= 0) {
            if (charInAscii >= 32 && charInAscii <= 126) {
                sum += charInAscii;
            }
            charInAscii = bufferedInputStream.read();
        }

        System.out.println(sum);
    }
}
