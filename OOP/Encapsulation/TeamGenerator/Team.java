package Encapsulation.TeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private List<Player> players;

    public Team(String name) {
        setName(name);
        this.players = new ArrayList<>();
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {

        boolean containsPlayer = false;

        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getName().equals(player.getName())) {

                containsPlayer = true;

                players.remove(players.get(i));
                break;
            }
        }

        if (!containsPlayer) {
            throw new IllegalArgumentException(String.format("Player %s is not in %s team.",player.getName(),name));
        }
    }

    public double getRating() {
        return players.stream().mapToDouble(Player::overallSkillLevel).sum()/players.size();
    }
}
