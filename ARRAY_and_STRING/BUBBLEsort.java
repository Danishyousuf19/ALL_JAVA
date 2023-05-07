import java.util.Arrays;
import java.util.Scanner;

public class BUBBLEsort {

	static void display(int a[]) {
		for(int element:a) {
			System.out.print(element+" ");
		}
	}
	
	static  int[] binary_sorting  (int a[]) {
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>=a[j+1]) {
					//swap
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
		}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("     ^^^BINARY SORT^^^");
		System.out.println("enter Size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter element of array");
			arr[i]=sc.nextInt();
		}
		 System.out.println("array before sorted");
	       display(arr);
	        System.out.println("\narray after sorted");
	       int new_ar[]= binary_sorting(arr);
           display(new_ar);
//       System.out.println(Arrays.toString(arr));
        
	}

}
