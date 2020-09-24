package comparableIFImpl;

public class Team implements Comparable {
    String name;
    int points;
    public Team(String name, int points) {
        this.name = name;
        this.points = points;
    }
    @Override
    public int compareTo(Object otherTeam) {
        int returnValue = -1;
        if (this.points < ((Team)otherTeam).points) {
            returnValue = 1;
        }
        return returnValue;
    }
}
