package tco.algo2016_2a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class LCMGCD { 
    
    public static String isPossible(int[] x, int t) {
        Set<Long> container = new HashSet<>();
        for(int i: x) {
            container.add((long) i);
        }
        List<Long> list = new ArrayList<>(container);
        if(list.size() == 1) {
           String result = checkGCDLCD(t, container, list,0,0);
           if(Objects.nonNull(result)) return result;
        }
        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.size() && j != i;j++) {
                String result = checkGCDLCD(t, container, list, i, j);
                if(Objects.nonNull(result)) 
                    return result;
            }
        }
        return "Impossible";
    }

    private static String checkGCDLCD(int t, Set<Long> container, List<Long> list, int i, int j) {
        long gcd = gcd((long) list.get(i),(long) list.get(j));
        long lcd = list.get(i) * list.get(j) / gcd;
        if((long) t == gcd || (long) t == lcd) {
            return "Possible";
        } 
        if(!container.contains(lcd)) {
            container.add(lcd);
            list.add(lcd);
        }
        if(!container.contains(gcd)) {
            container.add(gcd);
            list.add(gcd);
        }
        return null;
    }
    
    public static long gcd(long a, long b) {
        if(a%b == 0)
            return b;
        return gcd(b,a%b);
    }
}


