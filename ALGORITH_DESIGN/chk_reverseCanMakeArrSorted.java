
public class chk_reverseCanMakeArrSorted {
static void check(int arr[],int n)
{
	boolean b=false;
	int start=-1;
	int end=-1;
	for(int i=0;i<n-1;i++) {
		if(arr[i]>arr[i+1]&&start==-1) {
			start=i;
		}
		else if(start!=-1&&arr[i]<arr[i+1]&&end==-1) {
			end=i;
		}
		else if(arr[i] > arr[i + 1] && start != -1 && end != -1) {
			b=true;
		}
	}
	 if (arr[start] > arr[end + 1] || arr[end] < arr[start - 1] || b)
         System.out.println("No");
     else
         System.out.println("Yes");
 
}
}
