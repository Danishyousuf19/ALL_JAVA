import java.util.HashSet;
import java.util.Stack;

public class first_repeated_in_array {
	static int ele(int a[], int n) {
		HashSet<Integer> set = new HashSet<>();
		for (int i : a) {
			if (set.contains(i)) {
				return i;
			}
			set.add(i);
		}
		
		return -1;
	}
	
}
