/*
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

1. Starting with any positive integer, replace the number by the sum of the squares of its digits.
2. Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
3. Those numbers for which this process ends in 1 are happy.

Return true if n is a happy number, and false if not.

     
Example 1:

Input: n = 19
Output: true

Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1



Example 2:

Input: n = 2
Output: false
 
Constraints:    1 <= n <= 2^(31) - 1
 */

import java.util.ArrayList;
import java.util.HashMap;

public class HappyNumber {
    
    public static boolean isHappy(int n){
        HashMap<Integer, Integer> mapN = new HashMap<>();
        mapN.put(n,mapN.getOrDefault(n, 0)+1);
        while(n!=0){
            if(n==1)    return true;
            for(int num : mapN.values()){
                if(num > 1) return false;
            }
            int q = n/10;
            int r = n%10;
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(r);
            while(q!=0){
                r = q%10;
                q = q/10;
                arr.add(r);
            }
            int result = 0;
            for(int num : arr){
                result += (int)(Math.pow(num, 2));
            }
            n = result;
            mapN.put(n,mapN.getOrDefault(n, 0)+1);
        }

        return false;

        /*
        Optimal Solution
        public boolean isHappy(int n) {
            Set<Integer> seen = new HashSet<>();

            while (n != 1 && !seen.contains(n)) {
                seen.add(n);
                n = sumOfSquares(n);
            }

            return n == 1;
        }

        private int sumOfSquares(int n) {
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            return sum;
        }
         */
    }
    public static void main(String[] args) {
        int n=2;
        System.out.println(isHappy(n));
    }
}
