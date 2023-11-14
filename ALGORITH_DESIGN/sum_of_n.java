import java.util.Scanner;

public class sum_of_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  int n=sc.nextInt();
		  int a[]=new int[n];
		  int s=0;
		  for(int i=0;i<n;) {
			  int m=sc.nextInt();
			  if(m<0)continue;
			  a[i++]=m;
			  s+=m;
		  }
		  System.out.println("sum = "+s);
		  System.out.println("sum = "+rec(a,n-1));
	}
	static int rec(int a[],int n) {
		if(n==0)return a[0];
		return a[n]+rec(a,n-1);
	}

}
