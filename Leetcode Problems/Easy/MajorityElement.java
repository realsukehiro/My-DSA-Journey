/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

*/

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    
    public static int majorityElement(int[] nums){
        int n = nums.length;
        HashMap<Integer,Integer> mapE = new HashMap<>();
        for(int i=0;i<n;i++){
            mapE.put(nums[i], mapE.getOrDefault(nums[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> val : mapE.entrySet()){
            if(val.getValue() > n/2){
                return val.getKey();
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
