import java.util.Arrays;

public class return_cout_to_reduce_arr_until_all_elements_are_equal {
	public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	static void arrayReduction(int a[],int n) {
		Arrays.sort(a);
		int count=0;
		for(int i=0;i<n;i++) {
			if(i<n-1&&a[i]!=a[i+1]) {
				 System.out.println("Number of non-zero elements" + (n - i - 1));
	                count++;	
			}
		}
		 System.out.println("Number of non-zero elements:0");
	        System.out.println("Number of reduction:" + (count + 1));
	}
}
