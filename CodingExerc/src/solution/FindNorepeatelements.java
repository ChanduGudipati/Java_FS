package solution;

import java.util.HashSet;

public class FindNorepeatelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 1, 2, 4, 5, 5, 6 }; // 1,4,6
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			// 1,4,6
			if (set.contains(a[i])) {
				set.remove(a[i]);
			} else {
				set.add(a[i]);
			}
		}
		System.out.println(set);
	}

}
