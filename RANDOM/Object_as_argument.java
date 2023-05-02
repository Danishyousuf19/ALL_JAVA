package classwork;

import java.util.Scanner;

class point{
	int x;
	int  y;
	void setData(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 points ");
		x=sc.nextInt();
		y=sc.nextInt();
		
	}
	void distance(point p,point q) {
		System.out.print("nearst integer distance  =");
		int g=(p.x-q.x)*(p.x-q.x);
		int h=(p.y-q.y)*(p.y-q.y);
		int re =(int)(Math.sqrt(g+h));
		System.out.println(re);
	}
}



public class Object_as_argument {

	public static void main(String[] args) {
		//for 2 points
//		point p=new point ();
//		p.setData();
//		point q=new point();
//		q.setData();
//		point r=new point();
//		r.distance(p, q);
//		p.distance(p, q);
		//for many points

		point p[]=new point[4];
		point q[]=new point[4];
		
		for(int i=0;i<4;i++) {
			p[i]=new point();
		    q[i]=new point();
			p[i].setData();
			q[i].setData();
			p[i].distance(p[i],q[i]);
		}

	}

}
