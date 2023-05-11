package StreamsFilesAndDirectoriesExercises;

import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) throws IOException {

        String pathWords = "src/StreamsFilesAndDirectoriesExercises/Resources/words.txt";
        String pathText = "src/StreamsFilesAndDirectoriesExercises/Resources/text.txt";
        String pathStats = "src/StreamsFilesAndDirectoriesExercises/Resources/results.txt";

        BufferedInputStream bufferedInputStreamToWords = new BufferedInputStream(new FileInputStream(pathWords));
        BufferedInputStream bufferedInputStreamToText = new BufferedInputStream(new FileInputStream(pathText));

        Map<String, Integer> wordsAndCount = new HashMap<>();

        Scanner scanner = new Scanner(bufferedInputStreamToWords);

        while (scanner.hasNext()) {
            wordsAndCount.put(scanner.next(), 0);
        }

        scanner = new Scanner(bufferedInputStreamToText);
        String word = null;
        while (scanner.hasNext()) {
            word = scanner.next();
            for (String s : wordsAndCount.keySet()) {
                if (word.equals(s)) {
                    wordsAndCount.put(s, wordsAndCount.get(s) + 1);
                }
            }
        }

        FileWriter fileWriter = new FileWriter(pathStats);

        wordsAndCount.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(e -> {
                    try {
                        fileWriter.write(e.getKey()+" - "+e.getValue()+"\n");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

        fileWriter.close();
        bufferedInputStreamToText.close();

    }
}
