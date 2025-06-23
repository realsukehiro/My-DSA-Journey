import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        int count = 0;
        for(Map.Entry<Integer,List<Integer>> record : map.entrySet()){
            // System.out.println("Key: " + record.getKey() + "\tValue: " + record.getValue()); 
            int n = record.getValue().size();
            count += n*(n-1)/2;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] num = {1,2,3};
        int x = numIdenticalPairs(num); 
        System.out.println(x);
    }
}