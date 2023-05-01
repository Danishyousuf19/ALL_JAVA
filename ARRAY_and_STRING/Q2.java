// A pentagonal number is defined as n (3n–1)/2 for n = 1, 2, . . ., and so on. Therefore, the first 
// few numbers are 1, 5, 12, 22, . . . . 
// Write a method with the following header that returns a pentagonal number:
// public static int getPentagonalNumber(int n)
// Write a java program that uses this method to display the first 100 pentagonal numbers with10 numbers on each line
public class Q2 {
	
public static void  getpenta(int a) {
	for(int i=1;i<=100;i++) {
		int c=(3*i-1)*i/2;
		 {
			if(i%10==0) {
				System.out.println();
			}
		}System.out.print(c+" ");
	}
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
getpenta(100);//return
	
for(int i=1;i<=100;i++) {
	
	 System.out.print(getreturn(i)+" ");
		if(i%10==0) {
			System.out.println();
		}
	
	}
//by return
}
	public static int getreturn(int a) {
		
		return (3*a-1)*a/2;
	}
}
