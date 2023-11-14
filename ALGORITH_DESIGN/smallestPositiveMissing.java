import java.util.Arrays;
import java.util.Scanner;

public class smallestPositiveMissing {
	 public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Enter number of elements: ");
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++) {
		    	arr[i]=sc.nextInt();
		    }
		    int p=1,flag=0;
		    Arrays.sort(arr);
		    for(int i=0;i<n;i++) {
		    	if(arr[i]==p) {p++;
		    	flag=1;}
		    	else break;
		    }
//		    for no dublicate
		 if(flag==1)System.out.println("no = "+p);
		 else System.out.println("no = "+n+1);
		 int s=(n+2)*(n+1)/2,i;
		 for(i=0;i<n;i++) {
			 s-=arr[i];
		 }
		 System.out.println("no "+s);
}
	 }
