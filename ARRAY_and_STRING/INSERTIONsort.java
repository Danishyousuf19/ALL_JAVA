import java.util.Scanner;

public class INSERTIONsort {
	static void display(int a[]) {
		for(int element:a) {
			System.out.print(element+" ");
		}
	}
	
	static  int[] insertion_sorting  (int a[]) {
		
		for(int i=0;i<a.length;i++) {
			int current=a[i];
			int j=i-1;
			while(j>=0&&current<a[j])	{
				
				
				a[j+1]=a[j];
				j--;
			}
			//placement
			a[j+1]=current;
				
		}
		return a;
		}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("     ^^^INSERTION SORT^^^");
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
	       int new_ar[]= insertion_sorting(arr);
           display(new_ar);
	}
}
