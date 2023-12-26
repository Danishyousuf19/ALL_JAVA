import java.util.Arrays;

public class Quick_Sort {

	static void quickSort(int arr[],int p,int r) {
		if(p<r) {
			int q=partition(arr,p,r);
			quickSort(arr,p,q-1);
			quickSort(arr,q+1,r);
		}
	}
	static int partition(int arr[],int p,int r) {
		int i=p-1;
		int max=arr[r];
		for(int j=p;j<r;j++) {
			if(arr[j]<max) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,r);
		
		return i+1;
	}
	static void swap(int arr[],int i,int j) {
		int t=arr[j];
		arr[j]=arr[i];
		arr[i]=t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {11,2,3,-5,0,1};
		quickSort(arr,0,5);
		System.out.println(Arrays.toString(arr));
	}

}
