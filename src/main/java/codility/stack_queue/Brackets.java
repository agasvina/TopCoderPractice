package codility.stack_queue;

import java.util.Stack;

public class Brackets {
    public static int isNestedProperly(String S) {
        Stack<Character> nested = new Stack<>();
        for(int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i);
            if(isStartedBraket(currentChar)) {
                nested.add(currentChar); 
                continue;
            } else {
                if(nested.isEmpty()) return 0;
                if(!matched(nested.pop(), currentChar)) return 0;
            }
        }
        return (nested.isEmpty()? 1: 0);
    }
    
    private static boolean matched(char first, char second) {
        if(first == '(' && second == ')') return true;
        if(first == '{' && second == '}') return true;
        if(first == '[' && second == ']') return true;
        else return false;
    }
    
    private static boolean isStartedBraket(char braket) {
        if(braket == '[' || braket == '{'  || braket == '(') 
            return true;
        return false;
    }
}
