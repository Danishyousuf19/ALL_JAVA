
public class Kandans_Algorithm {
	static int KandansSum(int arr[], int n) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			if (sum < 0) {
				sum = arr[i];
			}
			maxSum = Math.max(maxSum, sum);
		}
		return maxSum;
	}

	public static void main(String[] args) {
int arr[]= {1,-2,-3,-4,3,-3};
System.out.println(KandansSum(arr,5));
	}

}
