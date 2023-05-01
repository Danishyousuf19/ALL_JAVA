
public class Q5 {
	public static double area(int n, double side) {
		double areaof= (n*(Math.pow(side, 2)))/(4.0*(Math.tan(Math.PI/n)));
		return areaof;
	}

public static  void main (String args[]) {
	int noofsides=4;double side=2;
	double d=area(noofsides,side);
	System.out.printf("area of polygon of %d sides and each of length %1.3f = %1.3f \n",noofsides,side,d); 
	
	AREA(4,2);
}

 
//void
public static void AREA(int a,double b) {
	double areaof= (a*(Math.pow(b, 2)))/(4.0*(Math.tan(Math.PI/a)));
	System.out.printf("area of polygon of %d sides and each of length %1.3f = %1.3f ",a,b,areaof);
	
}
}
