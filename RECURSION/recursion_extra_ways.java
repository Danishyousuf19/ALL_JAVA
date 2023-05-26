
public class recursion_extra_ways {
static void p(int x) {
//	if(x==6) {
//		return;
//	}
	System.out.print(x+" ");
	x++;
	if(x<=5) {
	p(x);}
}
	public static void main(String[] args) {
		
p(1);
System.out.println(fib(2,3,5));
	}
	static int fib(int a,int b,int n) {
		if(n==1)return a;
		if(n==2)return b;
		return fib(a,b,n-1)+fib(a,b,n-2);
			
		
	}

}
