package srm690;

public class WolfCardGame {

    public static int[] createAnswer(int N, int K) {
        int [] pr = {2,3,5,7};
        int dp = -1;
        for(int p: pr) {
            if(N%p!=0) {
                dp = p;
                break;
            }
        }
        int cardNum = dp;
        int [] result = new int[K];
        for(int i = 0; i < K;i++) {
            result[i] = cardNum;
            cardNum+=dp;
            if(cardNum > 100) dp=99; //if dp = 7 & k = 15 & N = 30
        }
        return result;
        
    }
}
