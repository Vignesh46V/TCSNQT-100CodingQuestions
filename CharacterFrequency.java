package Leetcode;

import java.util.HashMap;

public class CharacterFrequency {
    //Given a string, count how many times each character appears.

    public static void main(String[] args) {
        String word  = "seenu";

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : word.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        System.out.println(map);

        char most = ' ';

        int max = 0;

        for (char key : map.keySet()){
            int freq = map.get(key);

            if(freq > max ){
                max = freq;
                most = key;
            }
        }


        System.out.println("Most Frequent character: "+most);

    }
}
