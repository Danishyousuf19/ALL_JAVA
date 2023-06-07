
public class pattern_11 {
	 static void printTriangle(int n) {
	       for(int i=0;i<n;i++) {
//	    	   int c=
	    	   for(int j=0;j<=i;j++) {
	    		   if((j+i)%2==0) {
	    			   System.out.print(1+" ");
	    		   }
	    		   else {
	    			   System.out.print("0 ");
	    		   }
	    	   }System.out.println();
	       }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
printTriangle(4);
	}

}
//1
//0 1 
//1 0 1
//0 1 0 1 
//1 0 1 0 1