
public class pattern13 {
	 static void printTriangle(int n) {
		 int c=1;
	        for(int i=0;i<n;i++) {
	        	for (int j=0;j<=i;j++) {
	        		System.out.print(c+" ");
	        		c++;
	        	}
	        	System.out.println();
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTriangle(5);
	}

}
//1 
//2 3 
//4 5 6 
//7 8 9 10 