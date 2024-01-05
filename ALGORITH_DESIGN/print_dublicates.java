import java.util.HashSet;

public class print_dublicates {
static void print(int a[],int n) {
	HashSet<Integer> set = new HashSet<>();
	for (int i : a) {
		if (set.contains(i)) {
			System.out.print(i+" ");
		}
		set.add(i);
	}
	
}
}
