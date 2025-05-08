//Given an array of strings strs, group the anagrams together. 
//An anagram is a word formed by rearranging the letters of another word, using all the original letters exactly once. 
//Return the grouped anagrams as a list of lists.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

class Question_9{

  public static ArrayList<ArrayList<String>> groupAnagram(String[] list){

    //Initialize the data structures
    ArrayList<ArrayList<String>> groupList = new ArrayList<ArrayList<String>>();
    HashMap<String,ArrayList<String>> map = new HashMap<>();
    ArrayList<String> sort = new ArrayList<>();

    for(int i=0;i<list.length;i++){
      //convert each string in the given array to a sorted form 
      char[] chars=list[i].toCharArray();
      Arrays.sort(chars);
      String sorted = new String(chars);
      //insert the sorted value as key and the original value as value
      if(!map.containsKey(sorted)){
        map.put(sorted,new ArrayList<>());
      }
      map.get(sorted).add(list[i]);
    }

    //store all the values corresponding to a key in a new list and return it
    for(ArrayList<String> values : map.values()){
      groupList.add(values);
    }

    return groupList;

  }

  public static void main(String[] args){

    Question_9 q9 = new Question_9();
    System.out.println(q9.groupAnagram(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"}));
    
  }

}
