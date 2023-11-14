import java.util.Scanner;

public class largest_sum_contiginous {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	    System.out.print("Enter number of elements: ");
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    for (int i = 0; i < n; i++) {
	      System.out.print("Enter a number: ");
	      arr[i] = sc.nextInt();
	    }
	    int cs=0;
	    int c=0;
	    for(int i=0;i<n;i++) {
	    	if(arr[i]+cs<arr[i]) {
	    		cs=arr[i];
	    	}
	    	else {
	    		cs+=arr[i];
	    		if(cs>c)c=cs;
	    	}
	    }
	    System.out.println("max = "+c);
}
}
