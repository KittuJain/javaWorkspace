 import java.util.*;

class CollatzChain {
	static Set<Integer> set = new HashSet<Integer>();
	public static void main(String[] args) {
		int chainLength;
		int longestChainLength = 0;
		int startOfLongestChain = 0;
		int max = 100000;
		for (int i = max; i > 0; i--) {
			if(set.contains(i)) continue;
			chainLength = chainLength(i);
			if (longestChainLength < chainLength) {
				longestChainLength = chainLength;
				startOfLongestChain = i;
			}
		}
		
		System.out.println("Longest chain length upto " + max + " is " + longestChainLength +
		 " and it starts at " + startOfLongestChain);
	}

	public static int chainLength(int start) {
		int count = 1;
		set.add(start);
		while (start > 1){
			if (start % 2 == 0)
				start /= 2;
			else {
				start *= 3;
				start += 1;
			}
			count++;
			set.add(start);
		}
		return count;
	}
}




