
public class fibonacchi_in_one_step {
static int fibo(int n) {
	return (int) ( Math.pow((1+Math.sqrt(5))/2, n)/Math.sqrt(5));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<11;i++) {
	System.out.print(fibo(i)+" ");
}
	}

}
