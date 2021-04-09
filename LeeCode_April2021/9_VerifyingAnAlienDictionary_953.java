import java.util.*;
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<order.length(); i++){
            map.put(order.charAt(i), i);
        }
        for(int i=0; i<words.length-1; i++){
            if(!check(words[i], words[i+1], map)){
                return false;
            }
        }
        return true;
    }
    public static boolean check(String a, String b, HashMap<Character, Integer> map){
        int i=-1;
        while(++i < a.length() && i < b.length() ){
            if(map.get(a.charAt(i)) != map.get(b.charAt(i)) ){
                return map.get(a.charAt(i)) < map.get(b.charAt(i));
            }
        }
        return a.length()<=b.length();
    }
}