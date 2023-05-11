package SetsAndMaps.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String email;

        Map<String, String> namesAndEmails = new LinkedHashMap<>();

        while (!name.equals("stop")) {
            email = scanner.nextLine();
            namesAndEmails.put(name, email);
            name = scanner.nextLine();
        }

        Pattern pattern = Pattern.compile(".us$|.uk$|.com$|.US$|.UK$|.COM$");
        Matcher matcher;

        for (Map.Entry<String, String> entry : namesAndEmails.entrySet()) {
            matcher = pattern.matcher(entry.getValue());
            if (!matcher.find()) {
                System.out.println(entry.getKey()+" -> "+entry.getValue());
            }
        }

    }
}
