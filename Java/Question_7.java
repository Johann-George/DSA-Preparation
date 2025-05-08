import java.util.LinkedHashMap;
import java.util.Map;
class Question_7{

  public static Character findFirst(String sentence){

    LinkedHashMap<Character,Integer> map = new LinkedHashMap<>(); 
    String key=sentence.toLowerCase();

    for(int i=0;i<key.length();i++){
      map.put(key.charAt(i),map.getOrDefault(key.charAt(i),0)+1);
    }
    
    for(Map.Entry<Character,Integer> entry: map.entrySet()){
      if(entry.getValue().equals(1)){
        return entry.getKey();
      }
    }
    return null;
  }

  public static void main(String[] args){

    Question_7 q7 = new Question_7();
    System.out.println(q7.findFirst("Hi my name is Johann"));

  }

}
