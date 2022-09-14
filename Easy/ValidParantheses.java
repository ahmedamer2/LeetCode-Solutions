package Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParantheses {
    public boolean isValid(String s) {
        Map<Character, Character> brackets = new HashMap<Character, Character>();
        brackets.put(']', '[');
        brackets.put(')', '(');
        brackets.put('}', '{');

        Stack<Character> sStack = new Stack<Character>();

        for(char i : s.toCharArray()){
            if(!brackets.containsKey(i)){
                sStack.add(i);
            } else if (!sStack.empty() && sStack.peek() == brackets.get(i)){
                sStack.pop();
            }else{
                return false;
            }
        }

        if(sStack.empty()){
            return true;
        }

        return false;   
    }
}
