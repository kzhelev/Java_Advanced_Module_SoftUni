package SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command;

        Set<String> guestsList = new TreeSet<>();
        Set<String> vipGuest = new LinkedHashSet<>();
        Set<String> ordinaryGuest = new LinkedHashSet<>();

        Pattern pattern = Pattern.compile("^[0-9]");
        Matcher matcher;
        boolean itsPartyTime = false;

        while (true) {
            command = scanner.nextLine();
            matcher = pattern.matcher(command);

            if (command.equals("PARTY")) {
                itsPartyTime = true;
                continue;
            } else if (command.equals("END")) {

                for (String vGuest : vipGuest) {
                    guestsList.remove(vGuest);
                }
                for (String oGuest : ordinaryGuest) {
                    guestsList.remove(oGuest);
                }

                System.out.println(guestsList.size());

                for (String s : guestsList) {
                    System.out.println(s);
                }
                break;

            }

            if (itsPartyTime && matcher.find() && guestsList.contains(command)) {
                vipGuest.add(command);
            } else if (itsPartyTime && !matcher.find() && guestsList.contains(command)) {
                ordinaryGuest.add(command);
            } else {
                guestsList.add(command);
            }

        }
    }
}

