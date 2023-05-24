import java.util.HashSet;
import java.util.Iterator;
public class HASH_SET_basic {

	public static void main(String[] args) {
		HashSet <Integer>set=new HashSet<>();
		// add
		set.add(2);
		set.add(1);
		set.add(3);
		//Duplicate are not allowed
		set.add(1);
		System.out.println(set);
	//	[1, 2, 3]
		if(set.contains(2)) {
			System.out.println("yes");
		}			//yes
		set.remove(1);
		if(!set.contains(1)) {
			System.out.println("no");
		}
		//no
		System.out.println(set);
		//[2, 3]
		set.add(1);
		Iterator it=set.iterator();
		//it.next&&It .hasnext
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		//1
		//2
		//3
	}

}
