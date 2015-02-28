import java.util.*;

class CollatzChain {
	// static Map<Integer, Integer> collatzMap = new HashMap<Integer, Integer>();

	static class ChainComparator implements Comparator<Integer> {
		public int compare(Integer left, Integer right) {
			return (left-right);
		}

		public boolean equals(Object obj) {
			return false;
		}
	}
	static SortedSet<Integer> set = new TreeSet<Integer>(new ChainComparator());
	public static void main(String[] args) {
		set.add(2);
		set.add(1);
		set.add(4);
		set.add(7);
		set.add(7);
		set.add(1);
		set.add(9);
		set.add(2);
		set.add(0);
		for (Integer i : set ) {
			System.out.println(i);
		}
	// 	int chainLength;
	// 	int longestChainLength = 0;
	// 	int startOfLongestChain = 0;
	// 	int max = 7;
	// 	for (int i = 1; i < max; i++) {
	// 		chainLength = chainLength(i);
	// 		collatzMap.put(i, chainLength);
	// 		if (longestChainLength < chainLength) {
	// 			longestChainLength = chainLength;
	// 			startOfLongestChain = i;
	// 		}
	}
		
	// 	System.out.println("Longest chain length upto " + max + " is " + longestChainLength +
	// 	 " and it starts at " + startOfLongestChain);
	// }

	// public static int chainLength(int start) {
	// 	List<Integer> chain = new ArrayList<Integer>();
	// 	chain.add(start);
	// 	while (start > 1) {
	// 		if(collatzMap.containsKey(start))
	// 			return chain.size() + collatzMap.get(start);
	// 		if (start % 2 == 0)
	// 			start /= 2;
	// 		else {
	// 			start *= 3;
	// 			start += 1;
	// 		}
	// 		chain.add(start);
	// 	}
	// 	return chain.size();
	// }
}




