
/*
  You're given strings "jewels" representing the types of stones that are jewels, and "stones" representing the stones you have. Each character in "stones" is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

 

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0
 

Constraints:

1 <= jewels.length, stones.length <= 50
jewels and stones consist of only English letters.
All the characters of jewels are unique.
 */

import java.util.HashMap;
import java.util.Map;

public class Jewels_and_Stones {
    public static int numJewelsInStones(String jewels, String stones) {
        char[] Jewels = jewels.toCharArray();
        HashMap<Character, Integer> mapJ = new HashMap<>();
        for(int i=0; i<Jewels.length; i++){
            mapJ.putIfAbsent(Jewels[i], 1);   
        }
        for(Map.Entry<Character, Integer> obj : mapJ.entrySet()){
            System.out.println("key: " + obj.getKey() + "\tValue: " + obj.getValue());
        }
        char[] Stones = stones.toCharArray();
        int count = 0;
        for(int i=0; i<Stones.length; i++){
            if(mapJ.containsKey(Stones[i])){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
       String jewels = "z";
       String stones = "ZZZZZZ";
       
       int result = numJewelsInStones(jewels, stones);
       System.out.println(result);
    }
}
