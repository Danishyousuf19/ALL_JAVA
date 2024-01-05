
public class rec_binarySrch {
	static int idx(int a[], int l, int r, int t) {
		int mid = l + (r - l) / 2;
		if (a[mid] == t)
			return mid;
		if (a[mid] > t) {
			return idx(a, l, mid - 1, t);
		}
		return idx(a, mid + 1, r, t);
	}
}
