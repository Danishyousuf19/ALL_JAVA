package extra;

class test {
	test(){
		System.out.println("no constructor");
	}
	test(int x){
		this();
		System.out.println("int constructor");
	}
	test(double r){
		this(1);{
			System.out.println("double constructor");
		}
	}
	void chk() {
		System.out.println("check method");
	}
	void chkr() {
		this.chk();
		
		System.out.println("chker");
	}
}
public class this_use {

	public static void main(String[] args) {

		test x=new test();
		x.chkr();
		test x1=new test(2);
		x1.chkr();
		test x2=new test(2.0);
		x2.chkr();
		

	}

}
