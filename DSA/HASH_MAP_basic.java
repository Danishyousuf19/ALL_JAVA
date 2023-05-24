import java.util.*;

public class HASH_MAP_basic {

	public static void main(String[] args) {
		HashMap <String ,Integer> map=new HashMap<>();
		//add
		map.put("india", 122);
		map.put("chaina", 123);
        map.put("us", 23);
        System.out.println(map);
      //  {chaina=123, india=122, us=23}
        map.put("india", 124);
        System.out.println(map);
      //  {chaina=123, india=124, us=23}
        //search key
        if(map.containsKey("india")) {
        	System.out.println("yees");
        }
        else {  System.out.println("no");}
       // yees
       

        //search value
        System.out.println(map.get("chaina"));
        //123
        System.out.println(map.get("hhh"));
        //null;
        for (Map.Entry<String , Integer> e:map.entrySet()) {
        	System.out.println(e.getKey());
        	System.out.println(e.getValue());
        }
        //chaina
//        123
//        india
//        124
//        us
       // 23
        Set<String> keys=map.keySet();
        for(String ke:keys) {
        	System.out.println(ke+" "+map.get(ke));
        }
//chaina 123
//india 124
//us 23
        //remove
        map.remove("india");
        System.out.println(map);
      //  {chaina=123, us=23}
	}

}
