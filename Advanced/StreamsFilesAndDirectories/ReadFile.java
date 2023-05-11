package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String path = "src/StreamsFilesAndDirectories/Resources/input.txt";

        try {
            FileInputStream inputStream = new FileInputStream(path);
            int oneByte = inputStream.read();
            while (oneByte >= 0) {
                System.out.print(Integer.toBinaryString(oneByte)+" ");
                oneByte = inputStream.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
