public class Match {
    private Team homeTeam;
    private Team visitingTeam;

    public Match(Team one, Team two){
        homeTeam = one;
        visitingTeam = two;
    }

    public void analyseResults(){
        homeTeam.addGames();
        visitingTeam.addGames();
        if(homeTeam.getMatchPoints() > visitingTeam.getMatchPoints()){
            homeTeam.addGamesWon();
            visitingTeam.addGamesLost();
        }else{
            visitingTeam.addGamesWon();
            homeTeam.addGamesLost();
        }
    }
    
}
