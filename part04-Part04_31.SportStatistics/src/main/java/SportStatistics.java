
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Team> teams = new ArrayList<>();

        System.out.println("File:");
        String file = scan.nextLine();

        try(Scanner scanner = new Scanner(Paths.get(file))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String parts[] = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);
                
                Team firstTeam = new Team(homeTeam,homeTeamPoints);
                Team secondTeam = new Team(visitingTeam,visitingTeamPoints);
                Match newMatch = new Match(firstTeam,secondTeam);
                newMatch.analyseResults();
                teams.add(firstTeam);
                teams.add(secondTeam);
                
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Team:");
        String searchTeam = scan.nextLine();
        int totalGamesPlayed = 0;
        int totalWins = 0;
        int totalLosses = 0;

        for(int x = 0; x < teams.size();++x){
            if(teams.get(x).getTeamName().equals(searchTeam)){
                totalGamesPlayed += teams.get(x).getGamesPlayed();
                totalWins += teams.get(x).getGamesWon();
                totalLosses += teams.get(x).getGamesLost();
            }
        }

        System.out.println("Games: " + totalGamesPlayed);
        System.out.println("Wins: " + totalWins);
        System.out.println("Losses: " + totalLosses);

    } 
}
