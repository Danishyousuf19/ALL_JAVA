import java.util.*;

public class heap<T extends Comparable<T>> {
	ArrayList<T> list;

	heap() {
		list = new ArrayList<>();
	}

	private void swap(int i, int j) {
		T temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}

	private void print() {
		for (T i : list) {
			System.err.print(i + " ");
		}
	}

	private void insert(T item) {
		list.add(item);
		upheap(list.size() - 1);
	}

	private void upheap(int idx) {
		if (idx == 0) {
			return;
		}
		int parent = parent(idx);
		if (list.get(parent).compareTo(list.get(idx)) > 0) {
			swap(parent, idx);
			upheap(parent);
		}
	}

	private T remove() throws Exception {
		if (list.isEmpty())
			throw new Exception("Empty Heap");
		T temp = list.get(0);
		T last = list.remove(list.size() - 1);
		if (!list.isEmpty()) {
			list.set(0, last);
			downheap(0);
		}
		return temp;
	}

	private void downheap(int idx) {
		int min = idx;
		int l = left(idx);
		int r = right(idx);
		if (l < list.size() && list.get(l).compareTo(list.get(min)) < 0)
			min = l;
		if (r < list.size() && list.get(r).compareTo(list.get(min)) < 0)
			min = r;
		if (min != idx) {
			swap(min, idx);
			downheap(min);
		}
	}

	private void downheap_max(int idx) {
	    int max = idx;
	    int l = left(idx);
	    int r = right(idx);

	    // Compare with left child
	    if (l < list.size() && list.get(l).compareTo(list.get(max)) > 0)
	        max = l;

	    // Compare with right child
	    if (r < list.size() && list.get(r).compareTo(list.get(max)) > 0)
	        max = r;

	    // Swap if needed and continue down the heap
	    if (max != idx) {
	        swap(max, idx);
	        downheap_max(max);
	    }
	}
	private T removeMax() throws Exception {
	    if (list.isEmpty())
	        throw new Exception("Empty Heap");
	    T temp = list.get(0);
	    T last = list.remove(list.size() - 1);
	    if (!list.isEmpty()) {
	        list.set(0, last);
	        downheap_max(0);
	    }
	    return temp;
	}
 private ArrayList<T> heapSort_max() throws Exception
 {
	 ArrayList<T> temp = new ArrayList<>();
		while (!list.isEmpty()) {
			temp.add(this.removeMax());
		}
		return temp;
 }

	private ArrayList<T> heapSort() throws Exception {

		ArrayList<T> temp = new ArrayList<>();
		while (!list.isEmpty()) {
			temp.add(this.remove());
		}
		return temp;
	}

	private int parent(int idx) {
		return (idx - 1) / 2;
	}

	private int left(int idx) {
		return idx * 2 + 1;
	}

	private int right(int idx) {
		return idx * 2 + 2;
	}

	private void maxheap() {
		for (int i = list.size() / 2; i >= 0; i--) {
			downheap_max(i);
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		heap<Integer> hp = new heap<>();
		hp.insert(10);
		hp.insert(21);
		hp.insert(23);
		hp.insert(44);
		hp.insert(49);
		hp.insert(39);
		hp.insert(4);
//		hp.print();
		System.out.println();
//		hp.remove();
		hp.maxheap();
		hp.print();
//		System.out.println();
		ArrayList<Integer> sorted = hp.heapSort_max();
		for (int i : sorted) {
			System.out.print(i + " ");
		}

	}

}
