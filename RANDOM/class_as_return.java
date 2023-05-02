package classwork;

import java.util.Scanner;

class complexNo{
	int realpart;
	int imagnarypart;
	
	void setdata() {
		System.out.println("enter real and imagnary part of complex number");
		Scanner sc=new Scanner(System.in);
		realpart=sc.nextInt();
		imagnarypart=sc.nextInt();
		
	}
	
	void result() {
		System.out.println(realpart+" +i"+imagnarypart);
	}
	
	public complexNo Add(complexNo a ,complexNo b) {
		complexNo c=new complexNo();
		c.realpart=a.realpart+b.realpart;
		c.imagnarypart=a.imagnarypart+b.imagnarypart;
		return c;
		
	}
	///   THIS KEYWORD
	public complexNo SIMPLEADD(complexNo a ,complexNo b) {
		
		realpart=a.realpart+b.realpart;
		imagnarypart=a.imagnarypart+b.imagnarypart;
		return this;
		
	}
	
	
}

public class class_as_return {

	public static void main(String[] args) {
		complexNo x=new complexNo();
		x.setdata();
		complexNo y=new complexNo();
		y.setdata();
		complexNo z=new complexNo();
	   z= z.Add(y, x);
	    z.result();
	    z.SIMPLEADD(x, y);
	    z.result();
	
	
	}
	

}
