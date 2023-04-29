package classwork;

import java.util.Scanner;

class Student{
	int rollno;
	String name ;
	int section;
	public void set_data () {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your details @rollno @section @name");
		rollno=sc.nextInt();
		section =sc.nextInt();
		name=sc.next();
	}
	void get_data() {
		System.out.println("roll no. ="+rollno);
		System.out.println("section ="+section);
		System.out.println("name ="+name);
	}	
	void marks(int mark) {
			
			System.out.println("marks = "+mark);
		}
}
public class Array_of_object {

	public static void main(String[] args) {
		//for 1 object
//		Student a=new Student();
//		a.set_data();
//		a.get_data();
		// for many object We use ARRAY OF OBJECT;
		Student A[]=new Student[3];
	//	System.out.println("enter details");
		for(int i=0;i<3;i++) {
			A[i]=new Student();
			A[i].set_data();
			A[i].get_data();
			int mark =(int)(Math.random()*(100-33))+33;
			A[i].marks(mark);
		}

	}

}
