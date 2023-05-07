import java.util.Scanner;

public class SELECTIONsort {
	static void display(int a[]) {
		for(int element:a) {
			System.out.print(element+" ");
		}
	}
	
	static  int[] selection_sorting  (int a[]) {
		
		for(int i=0;i<a.length-1;i++) {
			int smallest=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[smallest]>=a[j]) {
					//swap smallest
					smallest=j;
					}
				}	
				int temp=a[smallest];
				a[smallest]=a[i];
				a[i]=temp;

		}
		return a;
		}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("     ^^^SELECTION SORT^^^");
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
	       int new_ar[]= selection_sorting(arr);
           display(new_ar);
	}
}
