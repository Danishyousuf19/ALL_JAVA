
public class check_sotted_array_by_recursion {

	static boolean rec(int arr[],int i) {
		if(i==arr.length-1)
			return true;
		return arr[i]<arr[i+1]&&rec(arr,i+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,2};
System.out.println(rec(arr,0));
	}

}
