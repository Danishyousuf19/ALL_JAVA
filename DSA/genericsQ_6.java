import java.nio.charset.Charset;

//Write a simple main class in Java that contains an experiment that uses the generic Box<T>
//class to build boxes with different types and that verifies that this class works as advertised.
//Your experiment should include the following:
// Create a boxed String object and two variables that refer to that box. Change the contents
//of one and determine the effect on the other.
// Create a boxed Integer object and two variables that refer to that box. Change the
//contents of one and determine the effect on the other.
// Create a boxed Object object and two variables that refer to that box. Determine what
//happens if you put a string in the box. Determine what happens if you put an integer in
//the box.

class box<T>{
	  T item;
	box(){
		this.item=null;
	}
	box(T item){
		this.item=item;
	}
	void setitem(T item) {
		this.item=item;
	}
	void getitem() {
		System.out.println(item);
	}
	
}
public class genericsQ_6 {

	public static void main(String[] args) {
		box <String >stringBox =new box<>("hello");
		box  <String> a=stringBox ;
		box  <String> b=stringBox ;
		a.setitem("world");
		a.getitem();
		b.getitem();
//		hello
//		hello
		box <Integer> IntegerBox =new box<>(22);
		box <Integer >t=IntegerBox;
		box<Integer >u=IntegerBox;
		t.setitem(2);
		u.setitem(99);
		t.getitem();
		u.getitem();
//		99
//		99
        box <Object> ObjectBox=new box<>("thank");
        box <Object> m=ObjectBox;
        box <Object> n=ObjectBox;
        m.setitem("you");
        n.setitem(n.item);
       // m.setitem(a.item);
        m.getitem();
        n.getitem();
//        you
//        you
      
        box<Character> characterBox = new box<>('A');

        // Create two variables referring to the same box
        box<Character> box3 = characterBox;
        box<Character> box4 = characterBox;

        // Change the contents of one box
        box3.setitem('B');
        box4.setitem('z');
        box3.getitem();
        box4.getitem();
//        z
//        z
	}

}
