package Encapsulation.TeamGenerator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Team> teams = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            String[] info = input.split(";");

            String teamName;
            String playerName;

            switch (info[0]) {
                case "Team":
                    teamName = info[1];
                    teams.put(teamName, new Team(teamName));
                    break;
                case "Add":
                    teamName = info[1];
                    playerName = info[2];
                    int endurance = Integer.parseInt(info[3]);
                    int sprint = Integer.parseInt(info[4]);
                    int dribble = Integer.parseInt(info[5]);
                    int passing = Integer.parseInt(info[6]);
                    int shooting = Integer.parseInt(info[7]);

                    try {

                        if (!teams.containsKey(teamName)) {
                            throw new IllegalArgumentException(String.format("Team %s does not exist.", teamName));
                        }

                        teams.get(teamName).addPlayer(new Player(playerName, endurance, sprint, dribble, passing, shooting));

                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case "Remove":
                    teamName = info[1];
                    playerName = info[2];

                    try {
                        if (!teams.containsKey(teamName)) {
                            throw new IllegalArgumentException(String.format("Team %s does not exist.", teamName));
                        }
                        Player player = new Player(playerName);
                        teams.get(teamName).removePlayer(player);

                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case "Rating":

                    teamName = info[1];

                    try {
                        if (!teams.containsKey(teamName)) {
                            throw new IllegalArgumentException(String.format("Team %s does not exist.", teamName));
                        }

                        System.out.println(teams.get(teamName).getName() + " - " + Math.round(teams.get(teamName).getRating()));

                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());;
                    }

                    break;
            }

            input = scanner.nextLine();
        }

    }
}
