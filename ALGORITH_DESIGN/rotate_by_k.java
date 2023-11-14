import java.util.Arrays;
import java.util.Scanner;

public class rotate_by_k {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  int max=Integer.MIN_VALUE;
		  int min=Integer.MAX_VALUE;
		  int n=sc.nextInt();
		  int k=sc.nextInt();
		  int a[]=new int[n];
		  for (int i=0;i<n;i++) {
			  a[i]=sc.nextInt();}
//		  brute force
		  int res[]=new int[n];
		  int l=0;
		  for(int i=k;i<n;i++) {
			  res[l++]=a[i];
		  }
		  for(int i=0;i<k;i++) {
			  res[l++]=a[i];
		  }
		  System.out.println("rotated = "+Arrays.toString(res));
		  rec(a,n,k);
		  System.out.println("rotated = "+Arrays.toString(a));
	}
	static void rec(int a[],int n,int k) {
		for(int i=1;i<=k;i++) {
			int temp=a[0];
			for(int j=1;j<n;j++) {
				a[j-1]=a[j];
			}
			a[n-1]=temp;
		}
		
	}
	static void rotateArr(int arr[], int d, int n)
    {d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        
    }
 static void reverse(int a[],int s,int e) {
     
	 while(s<e) {
		 int t=a[s];
		 a[s]=a[e];
		 a[e]=t;
		 s++;
		 e--;
				 
	 }
 }
 public void rohtate(int[] nums, int k) {
   	for(int i=0;i<k;i++) {
			int temp=nums[0];
			for(int j=1;j<nums.length;j++) {
				nums[j-1]=nums[j];
			}
			nums[nums.length-1]=temp;
		}
 }
}

