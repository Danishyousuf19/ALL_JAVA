import java.util.Arrays;

public class merge_without_extra_space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
static void merge(int a[],int []b) {
	int j=0;int i=a.length-1;
	while(j<b.length&&i>=0) {
		if(a[i]>b[j]) {
			int t=a[i];
			a[i]=b[j];
			b[j]=t;}
			i--;
			j++;
	}
	Arrays.sort(a);
	Arrays.sort(b);
}

}
