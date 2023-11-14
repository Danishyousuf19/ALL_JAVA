import java.util.Scanner;

public class maximum_minimum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  int max=Integer.MIN_VALUE;
		  int min=Integer.MAX_VALUE;
		  int n=sc.nextInt();
		  int a[]=new int[n];
		  for (int i=0;i<n;i++) {
			  a[i]=sc.nextInt();
			  if(a[i]<min)min=a[i];
			  if(a[i]>max)max=a[i];
		  }
		  System.out.println("max = "+max+" min = "+min);
		  int x[]={Integer.MIN_VALUE,Integer.MAX_VALUE};
		  rec(a,x,n-1);
		  System.out.println("max = "+x[0]+" min = "+x[1]);
	}
	static void rec(int a[],int b[],int n) {
		if(n==0)return;
		rec(a,b,n-1);
		if(a[n]>b[0])b[0]=a[n];
		if(a[n]<b[1])b[1]=a[n];
	}
}
