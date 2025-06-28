import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
    
    public static boolean isValid(String s){

        if(s.length()%2 != 0){  //return false of odd length
            return false;
        }

        HashMap<Character, Character> mapC = new HashMap<>();
        mapC.put('(',')');
        mapC.put('{','}');
        mapC.put('[',']');
        
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length();i++){
            if(mapC.containsKey(s.charAt(i))){
                st.push(s.charAt(i));
            }
            else{
                if(st.empty())  return false;
                char topV = st.pop();
                if(mapC.get(topV) != s.charAt(i))   return false;
            }
        }
        return st.empty();
    }
    
    public static void main(String[] args) {
        String s1 = "()[]{}" , s2 = "([])", s3 = "((";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));

    }
}
