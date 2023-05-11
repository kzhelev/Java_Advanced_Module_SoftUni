package StreamsFilesAndDirectoriesExercises;

import java.io.*;

public class SumLines {
    public static void main(String[] args) throws IOException {

        String path = "src/StreamsFilesAndDirectoriesExercises/Resources/input.txt";

        BufferedReader bufferedInputStream = new BufferedReader(new FileReader(path));
        String line = bufferedInputStream.readLine();
        char[] charAsAscii;

        int sum = 0;

        while (line != null) {
            charAsAscii = line.toCharArray();
            for (int i = 0; i < charAsAscii.length; i++) {
                sum += charAsAscii[i];
            }
            System.out.println(sum);
            sum = 0;
            line = bufferedInputStream.readLine();
        }

    }
}
