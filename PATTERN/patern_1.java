
public class patern_1 {
	 static String[] findThePattern(int N) {
	        String s[]=new String[N];
	        int ch=65;
	        for(int i=0;i<N;i++) {
	        	String n="";
	        	for(int j=0;j<N;j++) {
	        		if(i==0|j==0|i==N-1|j==N-1) {
	        			n=n+(char)ch;ch++;
	        		}
	        		else {
	        			n=n+"$";
	        		}
	        	}
	        	s[i]=n;
	        }
			return s;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
