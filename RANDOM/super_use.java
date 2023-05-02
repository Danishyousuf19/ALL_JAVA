package classwork;

import java.util.Scanner;

class job {
	//default const..
	job(){
		System.out.println("i m default constructor of JOB");
	}
	job(int id)
	{
		System.out.println("super used \n Acessing office details ");
	}
	
	String name;
	int salary;
	int id ;
	
	
	job(int salary,int id, String name){
		 this.name =name;
		 this.id=id;
		 this.salary=salary;
		 System.out.println("super used again ");
	}
	void position ( ){
		
		if(salary>20000) {
			System.out.println("you are ceo");
		}
		else {
			System.out.println("you are worker");
		}
		
	}
	 void display() {
		System.out.println("job name : asistant director");
		System.out.println("work from home");
	}
	void getdata()
	{
		System.out.println(" please enter  your id , slary , name");
		Scanner sc=new Scanner(System.in);
		id=sc.nextInt();
		salary=sc.nextInt();
		name=sc.next();
	}
	
}
class employ extends job{
	employ(){
		System.out.println("i m default constructor of employ");
	}
	String sirname;
		int id;
	int salary;
	employ(int id){
		super(id);
		System.out.println("welcome to the homepage of EMPLOY");
	}
	employ(String sirname,int salary,int id ,String name){
	super(salary, id, name);
		this.id=id;
		this.name=name;
		this.salary=salary;
		System.out.println("i m using super keyword");
		
	}
	
	 void display() {
		System.out.println("super used printing office details");
		super.display();
		System.out.println("printing actual details");
		System.out.println("actual salary : "+salary);
		System.out.println("salary : "+super.salary);
		System.out.println("id : "+super.id);
		System.out.println("name : "+name);
		System.out.println("sirname : "+sirname);
	}
}
//class test extends job{
//  test()
//{
//		System.out.println("i m default constructor of JOB");
//}
//	test(int id) {
//		super(id);
//		// TODO Auto-generated constructor stub
//	}
//	
//}

public class super_use {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter id");
		int id=sc.nextInt();
		employ x=new employ(id);
		x.getdata();
		System.out.println("enter sirname and actual salary to get actual data");
		x.sirname=sc.next();
		x.salary=sc.nextInt();
		x.display();
		x.position();
		
/////extra 
		//employ c=new employ("3",33,33,"33");
		//test t=new test();
		
	}

}
