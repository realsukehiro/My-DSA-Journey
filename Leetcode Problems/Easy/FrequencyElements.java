import java.util.HashMap;

class FrequencyElements {
    
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i < nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int maxValue = Integer.MIN_VALUE;
        for (int freq : map.values()) {
            if (freq > maxValue) {
                maxValue = freq;
            }
        }
        int count = 0;
        for (int freq : map.values()) {
            if (freq == maxValue) {
                count++;
            }
        }
        return count * maxValue;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        FrequencyElements fe = new FrequencyElements();

        int result = fe.maxFrequencyElements(nums);

        System.out.println(result);
    }

}