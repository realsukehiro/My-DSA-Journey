import java.util.HashMap;

public class RomanToInteger {
    
    public static int romanToInt(String s){
        int i,j;
        StringBuilder sb = new StringBuilder(s);
        sb.insert(0,"T");
        s = sb.toString();
        char[] charArr = s.toCharArray();
        HashMap<Character, Integer> mapR = new HashMap<>();
        mapR.put('I',1);
        mapR.put('V',5);
        mapR.put('X',10);
        mapR.put('L',50);
        mapR.put('C',100);
        mapR.put('D',500);
        mapR.put('M',1000);
        mapR.put('T',5000);

        int result = 0;
        // System.out.println("i value: "+charArr[charArr.length-2] + "\tj value: "+charArr[charArr.length-1]);
        j=charArr.length-1;
        for(i=charArr.length-2;i>=0;i--){
            if(mapR.get(charArr[i]) < mapR.get(charArr[j])){
                result += mapR.get(charArr[j]) - mapR.get(charArr[i]);
                j-=2;
                i--;
            }
            else if(mapR.get(charArr[i]) >= mapR.get(charArr[j])){
                if(charArr[i] == 'T'){
                    return result += mapR.get(charArr[j]);
                }
                result += mapR.get(charArr[j]);
                j--;
            }
            else{
                System.out.println("Invalid Roman Numeral input");
                return 0;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        String s = "MCDLXXVI";
        int result = romanToInt(s);
        System.out.println(result);
    }
}
