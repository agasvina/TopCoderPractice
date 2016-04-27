package srm689;
import java.util.HashSet;
import java.util.Set;

/**
 * This class is an example solution for Top Coder Div2 SRM689
 * */
public class NonDeterministicSubstring {
    
    public static int ways(String A, String B) {
        int counter = 0;
        Set<String> set = new HashSet<>();
        if(B.length() > A.length()) return 0;
        for(int i  = 0; i <= A.length() - B.length(); i++) {
            set.add(A.substring(i, i+B.length()));
        }
        
        for(String s: set) {
            //create the Regex Pattern:
            StringBuilder sb = new StringBuilder();
            sb.append('(');
            sb.append(B.replace("?", "."));
            sb.append(')');
            if(s.matches(sb.toString())) counter++;
        }
        
        return counter;
    }
}
