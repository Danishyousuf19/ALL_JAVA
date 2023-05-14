import java.util.Scanner;

//Create a class Student having two instance variable name and mark. Enter mark, name of the 
//student. If mark is more than 100, create exception MarksOutOfBoundException & throw it 
//using Java. Display the customised message Mark can’t be greater than 100 for the exception.
class MarksOutOfBoundException extends Exception{
	public String toString () {
		return "MarksOutOfBoundException: Mark can't be greater than 100";
	}
}
class StudentS{
	String name;
	double marks;
	void getdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the student");
		name=sc.next();
		System.out.println("enter DSA marks");
			marks=sc.nextDouble();
		
	}
	void display() throws MarksOutOfBoundException {
		if(marks>100) {
			throw new MarksOutOfBoundException();
		}
		System.out.println(name+" has got "+marks);
	}
}
public class exceptionhandling_Q3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentS s=new StudentS();
		try {
			s.getdata();
			s.display();
		}
		catch (MarksOutOfBoundException e) {
			System.out.println(e);
		}

	}

}
//Sample run-1:
//Enter the name of the student
//RAMESH
//Enter DSA marks
//98
//RAMESH has got 98.0
//Sample run-2:
//Enter the name of the student
//Raju
//Enter DSA marks
//130
//MarksOutOfBoundException: Mark can't be greater than 100
