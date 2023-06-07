
public class pattern7 {
	 static void printTriangle(int n) {
	      for(int i=n-1;i>=0;i--) {
	    	  for(int j=0;j<n;j++) {
	    		  if(j>=i) {
	    			  System.out.print("*");
	    		  }
	    		  else {
	    			  System.out.print(" ");
	    		  }

	    	  }
	    	  for(int k=0;k<=n-i-2;k++) {
	    		  System.out.print("*");
	    	  }
	    	  System.out.println();
	      }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
printTriangle(5);
	}

}
//   *
//  ***
// *****

