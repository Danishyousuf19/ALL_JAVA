
public class reversse {
static String x="";


	static String rev(String a,int i) {
		if(i==a.length())
			return x;
		char cu=a.charAt(i);
		x=cu+x;
		return (rev(a,i+1));
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(rev1("danis",0,""));
	}
	static String rev1(String a,int i,String nue) {
		if(i==a.length())
			return nue;
		char cu=a.charAt(i);
		x=cu+x;		
		x=(rev1(a,i+1,x));
		return x;
		
	}
	static String re(String a) {
		return rev1(a,0,"");
	}
}
