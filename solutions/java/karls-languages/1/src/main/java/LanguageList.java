import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty(){
        boolean isEmpty = false;
        if( languages.isEmpty() ){
        isEmpty = true;
    }
        return isEmpty;
    } 
    
    
    

    public void addLanguage(String language) {
       
            languages.add(language);
        
       }

    public void removeLanguage(String language) {
       
            languages.remove(language);
        
    
      }

    public String firstLanguage() {
        return languages.get(0);
      }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
      boolean containsLanguage = false;
            if(languages.contains(language)){
                containsLanguage = true;
         
        }
        return containsLanguage;
            }

    public boolean isExciting() {
         boolean isExciting = false;
    if(languages.contains("Java") || languages.contains("Kotlin")){
                return isExciting = true;
            }
        return isExciting;
            }
}
