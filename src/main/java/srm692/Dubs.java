package srm692;

public class Dubs {
	
	private static int [] doubleNumber = {11,22,33,44,55,66,77,88,99};
	
	public static long count(long before, long after) {
		long result =  doubleNumberBeforeInclusive(after) - doubleNumberBeforeInclusive(before);
		if(isDoubleNumber(before)) {
			result++;
		}
		return result;
	}
	
	public static long doubleNumberBeforeInclusive(long number) {
		long base = (long) Math.floor(number/100);
		long total = base*10;
		for(int i = 0; i < doubleNumber.length; i++) {
			long current = base*100 + doubleNumber[i];
			if(current <= number) 
				total++;
			else break;
		}
		return total;
	}
	
	
	public static  boolean isDoubleNumber(long number) {
		String stringNumber = number+"";
		if(stringNumber.length() > 1) 
			return stringNumber.charAt(stringNumber.length()-1) == stringNumber.charAt(stringNumber.length()-2);
		return false;
	}
}
 