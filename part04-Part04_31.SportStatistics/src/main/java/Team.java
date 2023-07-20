public class Team {
    private final String name;
    private int gamesPlayed;
    private int gamesWon;
    private int gamesLost;
    private int matchPoints;

    public Team(String teamName, int points){
        name = teamName;
        gamesPlayed = 0;
        gamesWon = 0;
        gamesLost = 0;
        matchPoints = points;
    }
    
    public int getMatchPoints(){
        return matchPoints;
    }
    
    public void addGames(){
       gamesPlayed += 1;
    }

    public void addGamesLost(){
        gamesLost += 1;
    }

    public void addGamesWon(){
        gamesWon += 1;
    }

    public int getGamesPlayed(){
        return gamesPlayed;
    }

    public int getGamesWon(){
        return gamesWon;
    }

    public int getGamesLost(){
        return gamesLost;
    }

    public String getTeamName(){
        return name;
    }
    
}
