package comparableIFImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class TeamCompareMain {
    static Random rnd = new Random();

    public static void main(String[] args) {
        Team[] teams = new Team[10];
        for(int i=0; i < 10; i++) {
            String teamName = "team" + i;
            int goals = rnd.nextInt(8);
            teams[i] = new Team(teamName, goals);
        }

        Arrays.sort(teams);

        for (Team team: teams) {
            System.out.println(team.name + ": " + team.points);
        }

        ArrayList<Team> newTeam = new ArrayList<>();
        for(int i=0; i < 10; i++) {
            String teamName = "newTeam" + i;
            int goals = rnd.nextInt(8);
            newTeam.add(new Team(teamName, goals));
        }

        // lambdával, ez bonyolultabb esetben is működik
        Collections.sort(newTeam, (Team t1, Team t2) -> Integer.valueOf(t1.compareTo(t2)));
        newTeam.forEach(team -> {
            System.out.println(team.name + ": " + team.points);
        });
    }
}
