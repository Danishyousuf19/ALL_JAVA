import java.util.ArrayList;

public class MaxHeap <T extends Comparable<T>>{

	
		ArrayList<T> list;

		MaxHeap() {
			list = new ArrayList<>();
		}
		int parent(int i) {
			return (i-1)/2;
		}
		int left(int i) {
			return i*2+1;
		}
		int right(int i) {
			return i*2+2;
		}
		void insert(T e) {
			list.add(e);
			heapup(list.size()-1);
		}
		void heapup(int i) {
			if(i==0)return ;
			int p=parent(i);
			if(list.get(i).compareTo(list.get(p))>0) {
				swap(i,p);
				heapup(p);
			}
		}
		T remove() throws Exception {
		    if(list.isEmpty()) throw new Exception("Empty Heap");
		    T temp = list.get(0);
		    T last = list.remove(list.size()-1); // This line is changed
		    if (!list.isEmpty()) { // This condition is added
		        list.set(0, last);
		        heapdown(0);
		    }
		    return temp;
		}
		void heapdown(int i) {
			int l=left(i);
			int r=right(i);
			int max=i;
			if(l<list.size()&&list.get(max).compareTo(list.get(l))<0)
				max=l;
			if(r<list.size()&&list.get(max).compareTo(list.get(r))<0)
				max=r;
			if(max!=i) {
				swap(i,max);
				heapdown(max);
			}
		}
		ArrayList<T> heapSort() throws Exception {
			ArrayList<T>temp=new ArrayList<>();
			while(!list.isEmpty()) {
				temp.add(this.remove());
			}
			return temp;
		}
		void print() {
			for (T i : list) 
				System.err.print(i + " ");
		}
		void swap(int i, int j) {
			T temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
		}
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
MaxHeap<Integer> hp=new MaxHeap<>();
hp.insert(10);
hp.insert(21);
hp.insert(23);
hp.insert(44);
hp.insert(49);
hp.insert(39);
hp.insert(4);
hp.print();
System.out.println();

//hp.print();
//System.out.println();
ArrayList<Integer> sorted = hp.heapSort();
for (int i : sorted) {
	System.out.print(i + " ");
}

	}

}
