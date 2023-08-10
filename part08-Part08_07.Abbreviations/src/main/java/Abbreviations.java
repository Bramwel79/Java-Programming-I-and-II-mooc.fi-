import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviations;
    
    public Abbreviations(){
       abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        abbreviations.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        if(abbreviations.containsKey(abbreviation)){
            return true;
        }else{
            return false;
        }
    }

    public String findExplanationFor(String abbreviation){
        String ans = abbreviations.get(abbreviation);
        if(ans == null){
            return null;
        }else{
            return ans;
        }
    }
}
