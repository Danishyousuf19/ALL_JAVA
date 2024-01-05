
public class rec_linear_srch {
	static int idx(int a[], int i, int n, int t) {
		if (i == n) {
			return -1;
		}
		if (a[i] == t)
			return i;
		return idx(a, i + 1, n, t);
	}
}
