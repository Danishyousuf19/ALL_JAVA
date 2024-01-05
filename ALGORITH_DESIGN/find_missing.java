import java.util.Arrays;

public class find_missing {
	static int ele(int n, int a[]) {
		Arrays.sort(a);
		int p = 1;
		for (int i = 0; i < n; i++) {
			if (a[i] != p)
				return p;
			else
				p++;
		}
		return p;
	}
}
