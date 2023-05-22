

public class palendromic_array {

	
		  public static int reverseNumber(int number) {
		        if (number < 10) {
		            return number;
		        }
		        
		        int lastDigit = number % 10;
		        int remainingDigits = number / 10;
		        
		        return (int) (lastDigit * Math.pow(10, String.valueOf(remainingDigits).length())) + reverseNumber(remainingDigits);
		    }
	public static int palinArray(int[] a, int n)
    {
      for (int i=0;i<n;i++) {
    	  int rev=reverseNumber(a[i]);
    	  if(a[i]==rev) {
    		  continue;
    	  }
    	  return 0;
      }return 1;
    }
	public static void main(String[] args) {
		//example;
int arr[]= {111,222,333};
System.out.println(palinArray(arr,3));
	}

}
