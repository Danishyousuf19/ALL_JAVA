import java.util.ArrayList;

public class linear_search_recursion {
static int rec(int arr[],int target,int i) {
	if(i>=arr.length)
		return -1;
	
	if(arr[i]==target) 
		return i;
	
		return rec(arr,target,i+1);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,1};
rec2(arr,0,1);
System.out.println(list);
	}
//	find alll index of element
	static ArrayList<Integer>list=new ArrayList<>();
	static void rec2(int arr[],int i,int target)
	{
		if(i==arr.length)
			return ;
		if(arr[i]==target)
			list.add(i);
		
			rec2(arr,i+1,target);
	}
}
