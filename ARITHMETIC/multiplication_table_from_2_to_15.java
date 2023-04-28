
public class multiplication_table_from_2_to_15 {
	// the multiplication table from 2 to 15.
	public static void main(String[] args) {
	int a=15;int i=1;int j=1;
	for ( i=2;i<=a;i++) {System.out.println("table of "+i);
		for (j=1;j<=10;j++) {int mult=1;
			 mult=j*i;
			System.out.printf(i+" x "+j+" = "+mult+"\n");
		}		}
	}
}
