
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translations;
    
    public DictionaryOfManyTranslations(){
        translations = new HashMap<>();
    }
    public void add(String word, String translation){
        translations.putIfAbsent(word, new ArrayList<>());

        ArrayList<String> words = translations.get(word);
        words.add(translation);

    }

    public ArrayList<String> translate(String word){
        ArrayList<String> ans = new ArrayList<>();
        ans = translations.getOrDefault(word, ans);
        return ans;
    }

    public void remove(String word){
        String keyToRemove = "";
        if(translations.containsKey(word)){
            for(String s : translations.keySet()){
              if(s.equals(word)){
                 keyToRemove = s;
              }
            }
        }
        translations.remove(keyToRemove);
    }
    
}
