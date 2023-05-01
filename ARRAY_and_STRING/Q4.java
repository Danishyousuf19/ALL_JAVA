
public class Q4 {
//according to question
	public static int noofdays(int a,int b) {
		int count =0;	int sum=0;for(int i=a;i<=b;i++) {
			if(((i%4==0)&(i%100!=0))|(i%400==0)) {
				count ++;
			}
			sum+=365;
			}
		return sum+count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a=2000,b=2020;	
	System.out.printf("NUMBER OF DAYS FROM %d AND %d = %d\n",a,b,noofdays(a,b));			

   days(a,b);
	}
//void
	public static void days(int a ,int b)
	{
	int count =0;	int sum=0;for(int i=a;i<=b;i++) {
		if(((i%4==0)&(i%100!=0))|(i%400==0)) {
			count ++;
		}
		sum+=365;
		}
	System.out.printf("no of days from %d to %d = %d",a,b,(sum+count));
	}

}