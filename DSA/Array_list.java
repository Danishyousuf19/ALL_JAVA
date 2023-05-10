package extra;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		ArrayList<Integer> list2=new ArrayList<>();


		list.add(1);
		list2.add(1);
list.add(3);
list.add(9);
list.add(1,4);
System.out.println(list);
list.set(0, 2);
System.out.println(list.get(0));
Collections.sort(list);
System.out.println(list);

System.out.println(list.equals(list2));
	}

}
