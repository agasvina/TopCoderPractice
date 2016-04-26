package srm689;
import java.util.HashSet;
import java.util.Set;

/**
 * This class is an example solution for Top Coder Div2 SRM689
 * */
public class NonDeterministicSubstring {
    
    public static int ways(String A, String B) {
        int counter = 0;
        Set<String> sub = new HashSet<>();
        if(B.length() > A.length()) return 0;
        for(int i  = 0; i <= A.length() - B.length(); i++) {
            sub.add(A.substring(i, i+B.length()));
        }
        
        for(String s: sub) {
            StringBuilder sb = new StringBuilder(B);
            int idx = 0;
            boolean counted = true;
            while(idx != -1) {
                idx = sb.indexOf("0");
                if(idx == -1) break;
                if(s.charAt(idx) == '1') {
                    counted = false;
                    break;
                }
                sb.setCharAt(idx, '?');
            }
            if(counted) {
                idx = 0;
                
                while(idx != -1) {
                    idx = sb.indexOf("1");
                    if(idx == -1) break;
                    if(s.charAt(idx) == '0') {
                        counted = false;
                        break;
                    }
                    sb.setCharAt(idx, '?');
                }
            }
            if(counted) counter++;
        }
        
        return counter;
    }
}
