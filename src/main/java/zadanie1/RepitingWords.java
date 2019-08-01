package zadanie1;

import lombok.Data;

import java.util.*;

@Data
public class RepitingWords {
    private Map<String ,Integer > repitMap;

    public RepitingWords() {
        repitMap = new HashMap<String, Integer>();
    }

    public void addCounter(String word){
        if(word.length()>1){
            String[] words = word.split(" ");

            for (String w: words) {
                if (repitMap.containsKey(w)){
                    repitMap.merge(w,1,Integer::sum);
                }else {
                    repitMap.put(w,1);
                }
            }
        }
    }
    public void quitAndList(){
        repitMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}
