
public class swap_two {
	public void swapElements(int[] arr, int n)
    {
      for(int i=0;i<n-2;i++) {
    	  int t=arr[i];
    	  arr[i]=arr[i+2];
    	  arr[i+2]=t;
      }
      for(int i=0;i<n;++i) {
          System.out.print(arr[i] + " ");
      }
      System.out.println();
  
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
